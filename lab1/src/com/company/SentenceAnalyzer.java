package com.company;

import java.io.FileWriter;
import java.io.IOException;

public abstract class SentenceAnalyzer implements NewSentenceObserver {
    private final String outputFileName;
    public SentenceAnalyzer(String outputFileName) {
        this.outputFileName = outputFileName;
        try {
            FileWriter writer = new FileWriter(outputFileName, false);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void report(String message) throws IOException {
        FileWriter writer = new FileWriter(outputFileName, true);
        writer.append(message + '\n');
        writer.flush();
        writer.close();
    }

    public abstract void analyze(String sentence);

    public void notifyNewSentence(String sentence) {
        analyze(sentence);
    }
}
