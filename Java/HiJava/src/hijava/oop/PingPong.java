package hijava.oop;

/**
 * 탁구 - NetSport 상속
 *
 * @author : Heum
 */
public class PingPong extends NetSport{

    @Override
    public void serve() {
        System.out.println("Sky Serve!");
    }

    @Override
    public void hit() {
        System.out.println("Smash");
    }

    @Override
    public void score() {
        System.out.println("1");
    }
}
