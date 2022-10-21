package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsonantsCounter extends SentenceAnalyzer {

    public ConsonantsCounter(String outputFileName) {
        super(outputFileName);
    }

    @Override
    public void analyze(String sentence) {
        try {
            String consonants = "qwrtypsdfghjklzxcvbnm";
            Pattern pattern = Pattern.compile("["+ consonants + consonants.toUpperCase(Locale.ROOT)+"]");
            Matcher matcher = pattern.matcher(sentence);

            report(Long.toString(matcher.results().count()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
