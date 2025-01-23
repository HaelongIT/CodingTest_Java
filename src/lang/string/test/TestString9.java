package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] strs = email.split("@");

        System.out.println("ID : " + strs[0]);
        System.out.println("Domain : " + strs[1]);
    }
}
