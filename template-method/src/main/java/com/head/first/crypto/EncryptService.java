package com.head.first.crypto;

import java.util.Base64;

public abstract class EncryptService {

    public final String encrypt(String str) {
        var bytesOfStringEncrypted = doEncrypt(str);
        if (isToConvertResultToBase64()) {
            var base64String = convertToBase64(bytesOfStringEncrypted);
            return base64String;
        }
        return new String(bytesOfStringEncrypted);
    }

    private final String convertToBase64(byte[] strBytes) {
        var base64Encoder = Base64.getEncoder();
        var bytesOfStringEncoded = base64Encoder.encode(strBytes);
        return new String(bytesOfStringEncoded);
    }

    protected boolean isToConvertResultToBase64() {
        return true;
    }

    protected abstract byte[] doEncrypt(String str);
}
