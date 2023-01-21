package hijava.practice;

/**
 * 별 찍기
 *
 * @author : Heum
 */
public class Star1 {

    public static void main(String[] args) {
        drawStar1();
        drawStar2();
    }

    private static void drawStar1() {
        /*
         * *
         * **
         * ***
         * ****
         * *****
         * ******
         * *******
         * */
        System.out.println("===drawStar1 START===");

        for (int i = 1; i <= 7; i++) { // 세로

            for (int j = 1; j <= i; j++) { // 가로
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("===drawStar1 END===");
    }

    private static void drawStar2() {
        /*
         *        *
         *       **
         *      ***
         *     ****
         *    *****
         *   ******
         *  *******
         * */
        System.out.println("===drawStar2 START===");

        int maxNum = 7;

        for (int i = 0; i < maxNum; i++) { // 세로

            for (int j = 1; j <= maxNum; j++) { // 가로
                System.out.print((j >= (maxNum - i)) ? '*' : ' '); // 삼항 연산자 연습
            }
            System.out.println();
        }

        System.out.println("===drawStar2 END===");
    }

}
