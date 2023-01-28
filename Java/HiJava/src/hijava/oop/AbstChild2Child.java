package hijava.oop;

/**
 * AbstChild2의 자식 클래스
 *
 * @author : Heum
 */
public class AbstChild2Child extends AbstChild2 {

    @Override
    public int max(int i, int j) {
        return i > j ? i - 100 : j - 1000;
    }
}
