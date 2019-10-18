package com.ltse.reader.reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationFileReader {
    public static List<String> readFile(Path filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        InputStream inputStream = Files.newInputStream(filePath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        while (reader.ready()) {
            lines.add(reader.readLine());
        }

        return lines;
    }
}
