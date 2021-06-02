package com.bluesoft.javvainaction.chap03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ProcessLambda {

    static String processFile(BufferedReaderProcessor processor) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jstol\\IdeaProjects\\java-functional-programming\\src\\main\\java\\com\\bluesoft\\javvainaction\\chap03\\data.txt"))){
            return processor.process(br);
        }
    }
}
