package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int startNum = str.indexOf(ext);
        // System.out.println(startNum);

        String filename = str.substring(0, startNum);
        String extName = str.substring(startNum);

        System.out.println("filename : " + filename);
        System.out.println("extName : " + extName);
    }
}
