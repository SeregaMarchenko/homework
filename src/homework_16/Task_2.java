package homework_16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_2 {

    public static final String[] NAMES = new String[]{
            "Oleg", "Max", "Alina",
            "Karina", "Milana", "Sergey",
            "Stanislav", "Zah", "Polina",
            "Angelina", "Marina", "Vlad",
            "Dak", "Viktoria", "Vitia"};


    public static void main(String[] args) {
        HashSet<Integer> correctId = new HashSet<>();
        correctId.add(1);
        correctId.add(2);
        correctId.add(5);
        correctId.add(8);
        correctId.add(9);
        correctId.add(13);
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < NAMES.length; i++) {
            hashMap.put(i + 1, NAMES[i]);
        }
        ArrayList<String> names = (ArrayList<String>) hashMap.entrySet().stream()
                .filter(entry->correctId.contains(entry.getKey())&&entry.getValue().length()%2!=0)
                .peek(entry-> entry.setValue(String.valueOf(new StringBuilder(entry.getValue()).reverse())))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}