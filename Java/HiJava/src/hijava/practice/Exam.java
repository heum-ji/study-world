package hijava.practice;

/**
 * Try This 연습문제용
 *
 * @author : Heum
 */
public class Exam {

    public static void main(String[] args) {
        // 구구단의 짝수단만 출력하시오.
        exam4();

        /* 아래와 같이 출력하시오.
         트리모양
         */
        exam5();

        // 1 ~ 100 사이에 존재하는 소수의 합을 구하시오.
        exam6();
    }

    private static void exam4() {
        for (int i = 2; i <= 9; i += 2) {
            System.out.println("===" + i + " 단===");

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

    private static void exam5() {
        int lineNum = 4;

        for (int i = 1; i <= lineNum; i++) {

            // 공백 반복
            for (int j = 0; j < (lineNum - i); j++) {
                System.out.print(' ');
            }

            // 별 그리기
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print('*');
            }

            System.out.println();
        }
        System.out.println("==============================");
    }

    private static void exam6() {
        int total = 0;

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            // 소수 판단
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("소수 : " + num);
                total += num;
            }
        }

        System.out.println("1 ~ 100 까지의 소수의 합 : " + total);
    }

}

