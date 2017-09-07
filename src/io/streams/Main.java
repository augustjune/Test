package io.streams;

import io.streams.ByteVsCharacterStream;

public class Main {
    public static void main(String[] args) {
        OpenCloseTest test = new OpenCloseTest();

        test.tryInputStreamRead();
    }
}
