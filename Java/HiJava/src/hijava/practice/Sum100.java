package hijava.practice;

/**
 * Try This
 * 1) 1 부터 100까지의 합을 구하시오.
 * 2) 1 부터 100까지의 수 중에서 홀수의 합을 구하시오.
 *
 * @author : Heum
 */
public class Sum100 {

    public static void main(String[] args) {
        // while
        sumByWhile();

        // for
        sumByFor();
    }

    // while문으로 합 구하기
    private static void sumByWhile() {
        int i = 0;
        int total = 0;

        while (++i <= 100) {
            if (i % 2 == 1) {
                continue;
            }
            total += i;
        }
        System.out.println("[While] 1 ~ 100 까지의 짝수의 합 : " + total);
    }

    // for문으로 합 구하기
    private static void sumByFor() {
        int total = 0;

        // 홀수의 합
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // 짝수는 제외
                continue;
            }
            total += i;
        }
        System.out.println("[For] 1 ~ 100 까지의 홀수의 합 : " + total);
    }
}
