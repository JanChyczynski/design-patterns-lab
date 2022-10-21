package com.company;

import java.util.ArrayList;
import java.util.List;

public class NewSentencePublisher {
    protected List<NewSentenceObserver> newSentenceObservers = new ArrayList<>();

    public void addObserver(NewSentenceObserver observer) {
        newSentenceObservers.add(observer);
    }
    public void removeObserver(NewSentenceObserver observer) {
        newSentenceObservers.remove(observer);
    }

    public void notifyNewLine(String sentence) {
        for(NewSentenceObserver observer : newSentenceObservers) {
             observer.notifyNewSentence(sentence);
        }
    }
}
