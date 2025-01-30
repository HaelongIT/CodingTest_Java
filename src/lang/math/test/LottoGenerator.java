package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private Random random = new Random();
    private int[] lottoArr = new int[6];

    public void lottoPrint() {
        lottoGenerate();

        // System.out.println("로또 번호 : " + lottoArr[0] + lottoArr[1] + lottoArr[2] +
        // lottoArr[3] + lottoArr[4] + lottoArr[5]);
        // System.out.println(lottoArr[0]);

        System.out.println("로또 번호 : " + lottoArr[0] + " " + lottoArr[1] + " " + lottoArr[2] + " " +
                lottoArr[3] + " " + lottoArr[4] + " " + lottoArr[5]);
    }

    // 무작위 숫자 생성 로직
    private void lottoGenerate() {

        for (int i = 0; i < 6; i++) {
            lottoArr[i] = random.nextInt(45) + 1;

            // 중복 방지 로직
            for (int j = 0; j < i; j++) {
                if (lottoArr[i] == lottoArr[j]) {
                    i -= 1;
                }
            }
        }
    }

    // public static void main(String[] args) {
    // Random random = new Random();
    // int randomNum = random.nextInt(45) + 1;
    // System.out.println(randomNum);
    // }
}
