package com.head.first.crypto;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2EncryptService extends EncryptService {

    private final int iterations;
    private final int memoryUsage;
    private final int parallelism;

    public Argon2EncryptService(int iterations, int memoryUsage, int parallelism) {
        this.iterations = iterations;
        this.memoryUsage = memoryUsage;
        this.parallelism = parallelism;
    }

    @Override
    protected byte[] doEncrypt(String str) {
        Argon2 argon2 = Argon2Factory.create(
                Argon2Factory.Argon2Types.ARGON2id,
                32,
                64);
        String strEncrypted = argon2.hash(iterations, memoryUsage, parallelism, str.toCharArray());
        argon2.wipeArray(str.toCharArray());
        return strEncrypted.getBytes();
    }

    @Override
    protected boolean isToConvertResultToBase64() {
        return false;
    }
}
