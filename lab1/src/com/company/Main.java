package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader();


        List<SentenceAnalyzer> analyzers = Arrays.asList(new WordsCounter("words.txt"),
                new VowelsCounter("vowels.txt"),
                new WordsReverser("rev.txt"),
                new ConsonantsCounter("consonants.txt"));

        analyzers.forEach(fileReader::addObserver);
        fileReader.read(args[0]);
    }
}
