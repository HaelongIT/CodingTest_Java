package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple, banana, mango";

        String[] fruitArrs = fruits.split(", ");

        for (String fruit : fruitArrs) {
            System.out.println(fruit);
        }

        String fruitsAfter = String.join("->", fruitArrs);
        System.out.println("joinedString = " + fruitsAfter);
    }
}
