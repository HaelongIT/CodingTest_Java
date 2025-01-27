package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private Random random = new Random();
    private int[] lottoArr = {};

    public void lottoPrint() {
        lonttoGenerate();

        System.out.println("로또 번호 : " + lottoArr[0] + lottoArr[1] + lottoArr[2] + lottoArr[3] +
                lottoArr[4] + lottoArr[5] + lottoArr[6]);
    }

    private void lonttoGenerate() {

        for (int i = 0; i < 6; i++) {
            lottoArr[i] = random.nextInt(45) + 1;
        }
    }

    // public static void main(String[] args) {
    // Random random = new Random();
    // int randomNum = random.nextInt(45) + 1;
    // System.out.println(randomNum);
    // }
}
