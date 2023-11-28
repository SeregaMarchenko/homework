package homework_13.Task_4;

import java.util.Arrays;
import java.util.List;

public class MyCollection<T> {
    public static final int FACTOR = 2;
    private int KOL = 10;
    private Object[] array = new Object[KOL];
    private int increment = 0;

    public void addElement(T element) {
        if (increment >= KOL) {
            KOL *= FACTOR;
            array = Arrays.copyOf(array, KOL);
        }
        array[increment] = element;
        increment++;
    }

    public T getElementsById(int id) {
        return (T) array[id];
    }

    public boolean isContains(T element) {
        for (int i = 0; i < increment; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        KOL = 10;
        array = new Object[KOL];
        increment = 0;
    }

    public void delete(T element) {
        int deleteId = -1;
        for (int i = 0; i < increment; i++) {
            if (array[i].equals(element)) {
                deleteId = i;
                break;
            }
        }
        if (deleteId != -1) {
            for (int i = deleteId; i < increment; i++) {
                array[i] = array[i + 1];
            }
            array[increment - 1] = null;
            increment--;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, increment));
    }
}
