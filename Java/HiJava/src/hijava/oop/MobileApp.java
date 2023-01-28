package hijava.oop;

/**
 * 모바일 앱 - Soft 추상클래스 상속
 *
 * @author : Heum
 */
public class MobileApp extends SoftWare {

    @Override
    public void plan() {
        System.out.println("MobileApp 기획");
    }

    @Override
    public void develop() {
        System.out.println("MobileApp 개발");
    }

    @Override
    public void release() {
        System.out.println("MobileApp 오픈");
    }
}
