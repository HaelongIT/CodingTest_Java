package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int startNum = 0;
        int countNum = 0;

        while (true) {
            startNum = str.indexOf(key, startNum) + 1;
            // System.out.println(startNum);

            if (startNum == 0) {
                break;
            }

            countNum += 1;
        }

        System.out.println("count = " + countNum);

    }
}
