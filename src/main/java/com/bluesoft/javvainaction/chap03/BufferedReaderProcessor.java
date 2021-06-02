package com.bluesoft.javvainaction.chap03;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
