package hijava.practice;

/**
 * Call By Value, Call By Reference 실습
 *
 * @author Heum
 */
public class Cbvr {
    int m = 2;

    public static void main(String[] args) {

        // Call By Value
        int i = 1;
        System.out.println("i1 = " + i);

        change1(i);
        System.out.println("i2 = " + i);

        // Call By Reference
        Cbvr cb1 = new Cbvr();
        System.out.println("cb1 = " + cb1.m);

        change2(cb1);
        System.out.println("cb2 = " + cb1.m);
    }

    // Call By Value : 값만 전달 됨 -> 원본 변화 X
    public static void change1(int x) {
        System.out.println("x = " + x);
        x = 100;
    }

    // Call By Reference : 객체 원본 주소 전달 -> 원본 변화 O
    public static void change2(Cbvr cb) {
        cb.m = 100;
    }
}
