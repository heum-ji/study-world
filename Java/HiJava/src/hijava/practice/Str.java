package hijava.practice;

/**
 * 문자형 실습
 *
 * @author Heum
 */
public class Str {

    public static void main(String[] args) {
        char c = '한'; // 54620이므로, 2Byte로 표현 가능하지만, 한글은 3Byte (UTF-8)
        byte b = 'B';

        System.out.println(c);
        System.out.println((int) c);
        System.out.println(b);

        String str = "AB";
        System.out.println(str);
        System.out.println("AB".getBytes().length);
        System.out.println("AB한".getBytes().length);
        System.out.println("한".getBytes().length);
    }
}
