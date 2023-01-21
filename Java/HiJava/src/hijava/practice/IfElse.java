package hijava.practice;

/**
 * if / else 조건문
 *
 * @author : Heum
 */
public class IfElse {
    public static void main(String[] args) {
        long ctm = System.currentTimeMillis() % 10; // 0 ~ 9, 즉 1자릿수 제한
        System.out.println("ctm = " + ctm);

        long sct = ctm % 3; // 0, 1, 2

        if (sct == 1) {
            System.out.println("One");

        } else if (sct == 2) {
            System.out.println("Two");

        } else {
            System.out.println("Zero");
        }
    }
}


