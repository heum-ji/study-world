package hijava.oop;

public class CalculatorImpl implements Calculator {

    /**
     * @param x
     * @param y
     */
    @Override
    public void add(int x, int y) {
        System.out.println(x + y);
    }

    /**
     * @param x
     * @param y
     */
    @Override
    public void sub(int x, int y) {
        System.out.println(x - y);
    }

    /**
     * @param x
     * @param y
     */
    @Override
    public void mul(int x, int y) {
        System.out.println(x * y);
    }

    /**
     * @param x
     * @param y
     */
    @Override
    public void div(int x, int y) {
        if (y == 0) {
            System.out.println("Cannot divide Zero!!");
        } else {
            System.out.println(x / y);
        }
    }
}
