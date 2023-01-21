package hijava.practice;

/**
 * 반복문
 *
 * @author : Heum
 */
public class Loop1 {

    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            i++; // i = i + 1

            // 짝수인 경우
            if (i % 2 == 0) {
                continue;
            }

            if (i > 5) {
                break;
            }

            System.out.println("TTTTTT>> " + i);
        }
    }
}
