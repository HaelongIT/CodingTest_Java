package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        StringBuilder strB = new StringBuilder(str);
        StringBuilder reverseStrB = strB.reverse();
        // System.out.println("reverseStrB = " + reverseStrB);

        String reverseStr = reverseStrB.toString();
        System.out.println("reverseStr = " + reverseStr);
    }

}
