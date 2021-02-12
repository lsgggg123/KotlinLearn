package com.lsgggg123.demo.kotlin.kotlin_call_java;

import java.io.IOException;

public class JavaCheckedException {
    public void ioe() throws IOException {
        throw new IOException("就是要抛 IO 异常");
    }
}
