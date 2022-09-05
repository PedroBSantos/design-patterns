package com.head.first;

import com.head.first.crypto.AesEncryptService;
import com.head.first.crypto.Argon2EncryptService;
import com.head.first.crypto.EncryptService;

public class App {
    
    public static void main(String[] args) {
        EncryptService aesEncrypt = new AesEncryptService("ssshhhhhhhhhhh!!!!", "ABCEDAEDAEFCABDE", "my_super_secret_key");
        String testString = "str plain text";
        var stringEncryptedWithAes = aesEncrypt.encrypt(testString);
        System.out.println(stringEncryptedWithAes);
        EncryptService argon2EncryptService = new Argon2EncryptService(22, 65536, 1);
        var stringEncryptedWithArgon2 = argon2EncryptService.encrypt(testString);
        System.out.println(stringEncryptedWithArgon2);
    }
}
