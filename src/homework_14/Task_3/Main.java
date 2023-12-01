package homework_14.Task_3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isLineCorrect("{[()]}"));
        System.out.println(isLineCorrect("(oo)ooo{o(pl)}oki[pp]"));
        System.out.println(isLineCorrect("(oo)ooo{o(pl})oki[pp]"));
        System.out.println(isLineCorrect("(ooooo{o(pl)}oki[pp])"));
    }

    public static boolean isLineCorrect(String line) {
        LinkedList<Character> list = new LinkedList<>();
        boolean flag = true;
        for (char symbol : line.toCharArray()) {
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                list.addFirst(symbol);
            }
            if (symbol == ')' || symbol == '}' || symbol == ']') {
                switch (symbol) {
                    case ')' -> symbol = '(';
                    case '}' -> symbol = '{';
                    case ']' -> symbol = '[';
                }
                if (!list.getFirst().equals(symbol)) {
                    return false;
                } else {
                    list.pop();
                }
            }
        }
        return flag;
    }
}