package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integerNum = Integer.valueOf(str);
        System.out.println("integer1 = " + integerNum);

        // Integer -> int
        int intNum = integerNum.intValue();
        System.out.println("intValue = " + intNum);

        // int -> Integer
        Integer integerNum2 = Integer.valueOf(intNum);
        System.out.println("integer2 = " + integerNum2);
    }
}
