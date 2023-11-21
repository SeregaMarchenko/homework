package homework_11.Task_1;

import homework_11.Task_1.Exception.WrongLoginException;
import homework_11.Task_1.Exception.WrongPasswordException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login;
        String password;
        String confirmPassword;
        System.out.println("Введите логин");
        login = SCANNER.nextLine();
        System.out.println("Введите пароль");
        password = SCANNER.nextLine();
        System.out.println("Подтвердите пароль");
        confirmPassword = SCANNER.nextLine();
        if (check(login, password, confirmPassword)) {
            System.out.println("Успешный ввод данных");
        }
    }

    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Некорректный ввод логина");
        }
        if (password.length() >= 20 || password.contains(" ") || (!isHasDigit(password)) || (!password.equals(confirmPassword))) {
            throw new WrongPasswordException("Некорректный ввод пароля");
        }
        return true;
    }

    public static boolean isHasDigit(String password) {
        Matcher matcher = Pattern.compile("[0-9]").matcher(password);
        matcher.find();
        return (!matcher.group().isBlank());
    }
}
