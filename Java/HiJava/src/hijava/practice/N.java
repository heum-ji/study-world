package hijava.practice;

/**
 * Try This
 * N 이라는 클래스 속에는 x, y 두개의 변수가 있는데,
 * swap() 함수를 호출하면 x, y의 값이 서로 치환되도록 코딩하시오.
 *
 * @author Heum
 */
public class N {
    int x = 10;
    int y = 20;

    // 이부분을 구현하기!
    public void swap() {
        // 내가 구현한 방법
        // int temp = x;
        //
        // x = y;
        // y = temp;

        // 강사님 방법
        int t = x;
        x = y;
        y = t;
    }

    public static void main(String[] args) {
        N n = new N();
        System.out.println("x = " + n.x);
        System.out.println("y = " + n.y);

        n.swap();

        System.out.println("====================");
        System.out.println("x = " + n.x);
        System.out.println("y = " + n.y);
    }
}
