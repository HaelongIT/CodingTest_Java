package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] strings = {"hello", "java", "jvm", "spring", "jpa"};

        int sumLen = 0;

        for (String s : strings) {
            int sLen = s.length();
            System.out.println(s + " : " + sLen);

            sumLen += sLen;
        }


        System.out.println("sum = " + sumLen);
    }
}