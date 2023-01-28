package hijava.oop;

/**
 * 추상 클래스 상속 받은 자식 추상 클래스
 *
 * @author : Heum
 */
public abstract class AbstChild2 extends AbstSuper {

    @Override
    public int max(int i, int j) {
        return i > j ? i + 100 : j + 1000;
    }
}
