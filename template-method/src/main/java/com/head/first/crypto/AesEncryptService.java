package com.head.first.crypto;

import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AesEncryptService extends EncryptService {

    private final String salt;
    private final String iv;
    private final String key;

    public AesEncryptService(String salt, String iv, String key) {
        this.salt = salt;
        this.iv = iv;
        this.key = key;
    }

    @Override
    protected byte[] doEncrypt(String str) {
        try {
            var ivSpec = new IvParameterSpec(iv.getBytes());
            var secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            var keySpec = new PBEKeySpec(key.toCharArray(), salt.getBytes(), 65536, 256);
            var secretKey = secretKeyFactory.generateSecret(keySpec);
            var secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            var cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivSpec);
            return cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | InvalidKeyException
                | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e) {
            throw new RuntimeException(e);
        }
    }
}
