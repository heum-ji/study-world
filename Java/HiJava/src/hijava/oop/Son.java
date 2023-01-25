package hijava.oop;

/**
 * 자식 클래스
 *
 * @author : Heum
 */
public class Son extends Mom {

    public Son() {
        super("아들");
    }

    public Son(String name) {
        super(name);
    }

    public void drinkMilk() {
        System.out.println("우유를 마셔요~");
    }

    @Override
    protected void say() {
        System.out.println("Son said...");
    }

    public void ttt() {
        System.out.println("TTT");
    }
}
