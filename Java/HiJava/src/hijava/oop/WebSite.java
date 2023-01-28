package hijava.oop;

/**
 * 웹사이트 - Soft 추상클래스 상속
 *
 * @author : Heum
 */
public class WebSite extends SoftWare {

    @Override
    public void plan() {
        System.out.println("Site 기획");
    }

    @Override
    public void develop() {
        System.out.println("Site 개발");
    }

    @Override
    public void release() {
        System.out.println("Site 오픈");
    }
}
