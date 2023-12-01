package homework_14.Task_1;

import javax.swing.text.StyledEditorKit;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCollection(new String[]{"d", "d", "g", "h", "k", "a", "t", "v", "a", "h", "o", "p", "o"}));
    }

    public static HashMap<String, Boolean> getCollection(String[] words) {
        HashMap<String, Boolean> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.containsKey(word));
        }
        return map;
    }
}
