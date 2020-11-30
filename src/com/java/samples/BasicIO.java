package com.java.samples;
import java.io.*;

/*
 Realization of File Reading using BufferedReader
 Created 30.11.2020 by Bogdan Lonchuk
 */

public class BasicIO {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("text_file.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();

            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
            String allFileText = stringBuilder.toString();
            System.out.println(allFileText);
        }
    }
}
