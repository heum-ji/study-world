package hijava.oop;

/**
 * 추상 클래스
 *
 * @author : Heum
 */
public abstract class AbstSuper {
    public abstract int max(int i, int j);

    public int min(int i, int j) {
        return i > j ? j : i;
    }
}
