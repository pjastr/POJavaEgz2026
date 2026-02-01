package algorithm;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        filterCollection(list, x -> x % 2 == 0);
        System.out.println(list);
    }

    public static <E> void filterCollection(ArrayList<E> item, Predicate<E> condition){
        if (item == null || condition == null)
            throw new IllegalArgumentException("Arguments cannot be null");
        // item.removeIf(condition.negate()); // pierwszy sposób
        // drugi za pomocą pętli
        ArrayList<E> newList = new ArrayList<>();
        for (E e : item) {
            if (condition.test(e))
                newList.add(e);
        }
        item.clear();
        item.addAll(newList);
    }
}
