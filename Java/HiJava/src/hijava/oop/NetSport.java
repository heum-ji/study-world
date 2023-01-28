package hijava.oop;

/**
 * Net 스포츠 공통 추상 클래스
 * 
 * @author : Heum
 */
public abstract class NetSport {
    public abstract void serve();

    public abstract void hit();

    public abstract void score();

    // Template Method : 상속 받는 모든 자식 클래스들의 동일한 동작 방식을 정의하는 Method
    // final : 더이상 Override 못하게 하기 위해 사용
    public final void play() {
        serve();
        hit();
        score();
    }

}
