package hijava.practice;

/**
 * 정수형 변수 실습
 *
 * @author Heum
 */
public class Num {

    public static void main(String[] args) {
        byte b = 1;
        short s = 1;

        int i = 2147483647; // 정수는 기본형이 int
        long l = 2147483648L; // 어미에 L을 입력하면 int -> long 형변환이 되지 않고 바로 long 타입으로 됨

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
