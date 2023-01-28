package hijava.oop;

/**
 * 소프트웨어 최상위 추상 클래스
 *
 * @author : Heum
 */
public abstract class SoftWare {
    public abstract void plan();

    public abstract void develop();

    public abstract void release();

    void product() {
        plan();
        develop();
        release();
    }
}
