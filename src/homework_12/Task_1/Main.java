package homework_12.Task_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final File FILE = new File("src\\homework_12\\Task_1\\romeo-and-juliet.txt");
    public static final File OUT_FILE = new File("src\\homework_12\\Task_1\\outFile.txt");

    public static void main(String[] args) {
        String longLine = "";
        StringBuilder lineBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(FILE);
             FileWriter fileWriter = new FileWriter(OUT_FILE)) {
            int b;
            while ((b = fileReader.read()) != -1) {
                lineBuilder.append((char) b);
            }
            Matcher matcher = Pattern.compile("\\b\\w+-?\\w+-?\\w+'?\\w+\\b").matcher(String.valueOf(lineBuilder));
            while (matcher.find()) {
                if (matcher.group().length() > longLine.length()) {
                    longLine = matcher.group();
                }
            }
            fileWriter.write(longLine);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
