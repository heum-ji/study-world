package hijava.oop;

/**
 * 추상 클래스 상속 받은 자식 클래스
 *
 * @author : Heum
 */
public class AbstChild extends AbstSuper {

    @Override
    public int max(int i, int j) {
        return i > j ? i : j;
    }
}
