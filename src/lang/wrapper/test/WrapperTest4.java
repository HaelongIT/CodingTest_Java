package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        // int num = Integer.parseInt(str);
        // Integer integer1 = num;
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer -> int
        int integer = integer1;
        System.out.println("integer = " + integer);

        // int -> Integer
        Integer integer2 = integer;
        System.out.println("integer2 = " + integer2);
    }
}
