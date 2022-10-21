package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WordsReverser extends SentenceAnalyzer {

    public WordsReverser(String outputFileName) {
        super(outputFileName);
    }

    @Override
    public void analyze(String sentence) {
        StringBuilder buffer = new StringBuilder();
        StringBuilder out = new StringBuilder();
        Set<Character> separators = " ,:.!?\t\n".chars().mapToObj(e->(char)e).collect(Collectors.toSet());

        for (int i = 0; i < sentence.length(); i++) {
            Character ch = sentence.charAt(i);
            if(separators.contains(ch)){
                out.append(buffer.reverse());
                buffer = new StringBuilder();
                out.append(ch);
            } else {
                buffer.append(ch);
            }
        }
        out.append(buffer.reverse());
        try {
            report(out.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
