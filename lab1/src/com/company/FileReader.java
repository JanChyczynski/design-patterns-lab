package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader extends NewSentencePublisher {
    public void read(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file).useDelimiter("[.?!]\\s*");
        while(scanner.hasNext()){
            notifyNewLine(scanner.next());
        }
        scanner.close();
    }
}
