package com.ltse.reader.reader;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        String fileUri = args[0];
        Path filePath = Paths.get(fileUri);
        List<String> lines = ConfigurationFileReader.readFile(filePath);
        
        System.out.println(lines);
    }
}
