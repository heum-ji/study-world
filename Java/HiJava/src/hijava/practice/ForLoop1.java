package hijava.practice;

/**
 * 이중 For문
 *
 * @author : Heum
 */
public class ForLoop1 {

    public static void main(String[] args) {

        // 구구단 출력
        for (int i = 2; i <= 9; i++) {
            System.out.println("==========");

            System.out.println("  [" + i + "단]");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("==========\n");
        }
    }
}
