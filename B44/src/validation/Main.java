package validation;

public class Main {

    static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Integer[] b = {1, 2, 3, 4, 5};
        Integer[] c = {1, 6};

        System.out.println(isSubset(a, b));
        System.out.println(isSubset(c, b));


    }

    static <T> boolean isSubset(T[] tab1, T[] tab2) {
        if (tab1 == null || tab2 == null)
            throw new IllegalArgumentException("Arrays must not be null");

        for (T element : tab1) {
            boolean found = false;
            for (T other : tab2) {
                if (element.equals(other)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
