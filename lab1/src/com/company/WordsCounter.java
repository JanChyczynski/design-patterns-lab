package com.company;

import java.io.IOException;
import java.util.Arrays;

public class WordsCounter extends SentenceAnalyzer{
    public WordsCounter(String outputFileName) {
        super(outputFileName);
    }

    @Override
    public void analyze(String sentence) {
        try {
            report(Integer.toString(sentence.split(" +").length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
