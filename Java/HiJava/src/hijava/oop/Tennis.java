package hijava.oop;

/**
 * 테니스 - NetSport 상속
 *
 * @author : Heum
 */
public class Tennis extends NetSport {

    @Override
    public void serve() {
        System.out.println("테니스 서브");
    }

    @Override
    public void hit() {
        System.out.println("테니스 히트");
    }

    @Override
    public void score() {
        System.out.println("15");
    }
}
