package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class VowelsCounter extends SentenceAnalyzer{
    public VowelsCounter(String outputFileName) {
        super(outputFileName);
    }

    @Override
    public void analyze(String sentence) {
        try {
            String vowels = "euioa";
            Pattern pattern = Pattern.compile("["+ vowels + vowels.toUpperCase(Locale.ROOT)+"]");
            Matcher matcher = pattern.matcher(sentence);

            report(Long.toString(matcher.results().count()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
