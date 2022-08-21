package com.head.first.stream;

import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream) throws FileNotFoundException {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int charReaded = super.read();
        return charReaded == -1 ? charReaded : Character.toLowerCase((char) charReaded);
    }

    @Override
    public int read(byte[] bytes, int offset, int length) throws IOException {
        int charReaded = super.read(bytes, offset, length);
        for (int i = offset; i < offset + charReaded; i++) {
            bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
        }
        return charReaded;
    }
}
