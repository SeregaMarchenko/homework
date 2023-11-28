package homework_12.Task_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final File CORRECT_FILE = new File("src\\homework_12\\Task_2\\files\\correctInfoFile.txt");
    public static final File WRONG_FILE = new File("src\\homework_12\\Task_2\\files\\wrongInfoFile.txt");
    public static final String WARNING_MESSAGE = "некорректный ввод номера документа\n";
    public static final String DOCNUM_REGEX = "^docnum[A-z0123456789]{9}$";
    public static final String CONTRACT_REGEX = "^contract[A-z0123456789]{7}$";
    public static final int WRONG_INDEX = -1;

    public static void main(String[] args) {
        System.out.println("Введите путь к документу который хотите прочитать");
        File file = new File(SCANNER.nextLine());
        //correct address "src\\homework_12\\Task_2\\files\\info.txt"
        StringBuilder builder = new StringBuilder();
        Matcher matcherDocnum;
        Matcher matcherContract;
        try (FileReader reader = new FileReader(file)) {
            int b;
            FileWriter writer;
            while ((b = reader.read()) != WRONG_INDEX) {
                builder.append((char) b);
                if ((char) b == '\n') {
                    matcherDocnum = Pattern.compile(DOCNUM_REGEX).matcher(String.valueOf(builder));
                    matcherContract = Pattern.compile(CONTRACT_REGEX).matcher(String.valueOf(builder));
                    if (matcherDocnum.find() || matcherContract.find()) {
                        writer = new FileWriter(CORRECT_FILE, true);
                        writer.write(String.valueOf(builder));
                    } else {
                        writer = new FileWriter(WRONG_FILE, true);
                        writer.write(String.valueOf(builder));
                        writer.write(WARNING_MESSAGE);
                    }
                    writer.flush();
                    writer.close();
                    builder.delete(0, builder.length());
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
