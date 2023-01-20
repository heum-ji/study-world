package hijava.practice;

/**
 * 연산자 공부
 *
 * @author : Heum
 */
public class Oper {

    public static void main(String[] args) {
        /*
         * 연산자 우선순위
         * 1차식 (괄호)
         * 단항 연산자 (!, ++, --)
         * 산술 연산자 (*, /, %, +, -)
         * 비트 이동 (<<, >>)
         * 관계 연산자 (>, <)
         * 비트곱 -> 비트차 -> 비트합
         * 논리 AND(&&), 논리 OR(||)
         * 조건(이항) 연산자
         * 대입 연산자
         */
        int i = 0;

        i += 1; // i = i + 1 <==> i++
        i *= 10; // i = 1 * 10

        System.out.println(i);

        int k = !(i > 0) ? 100 : 1000; // 삼항연산자 -> 조건문 ? 참 : 거짓
        System.out.println("k = " + k);


        System.out.println(i);
    }
}