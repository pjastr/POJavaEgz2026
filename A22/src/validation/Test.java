package validation;

public class Test {

    static void main(String[] args) {
        System.out.println(isAnyMatch(1, 2, 3));
        System.out.println(isAnyMatch(1, 2, 1));
        System.out.println(isAnyMatch("AA", "AA", "CC"));
    }

    public static <T> boolean isAnyMatch(T arg1, T arg2, T arg3){
        if (arg1 == null || arg2 == null || arg3 == null)
            return false;
        if (arg1.equals(arg2) || arg2.equals(arg3) || arg1.equals(arg3))
            return true;
        return false;
    }
}
