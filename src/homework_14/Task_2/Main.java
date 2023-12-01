package homework_14.Task_2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCollection(new String[]{"moon", "night", "main", "cat", "san"}));
    }

    public static HashMap<String, String> getCollection(String[] words) {
        HashMap<String, String> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            map.put(String.valueOf(chars[0]), String.valueOf(chars[chars.length - 1]));
        }
        return map;
    }
}
