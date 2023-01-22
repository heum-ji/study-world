package hijava.practice;

/**
 * 피보나치 수열 (재귀함수)
 *
 * @author : Heum
 */
public class Fibonacci {

    public static void main(String[] args) {
        int iNum = 10;

        for (int i = 0; i <= iNum; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    private static int fibo(int num) {
        if (num > 1) {
            return fibo(num - 1) + fibo(num - 2);
        }
        return num; // 0, 1 처리
    }
}
