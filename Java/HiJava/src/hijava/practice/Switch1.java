package hijava.practice;

/**
 * Switch 문
 *
 * @author : Heum
 */
public class Switch1 {

    public static void main(String[] args) {
        long ctm = System.currentTimeMillis() % 10; // 0 ~ 9, 즉 1자릿수 제한
        System.out.println("ctm = " + ctm);

        long sct = ctm % 3; // 0, 1, 2

        switch ((int) sct) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Zero");
        }
    }
}
