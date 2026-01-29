package checking;

import java.util.HashSet;

public class Test {

    static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(5);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(6);
        System.out.println(checkDisjoint(set1, set2));
    }

    public static <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2){
        for(var elem : set1){
            if(set2.contains(elem))
                return false;
        }
        return true;
    }
}
