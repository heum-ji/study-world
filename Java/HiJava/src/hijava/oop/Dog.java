package hijava.oop;

/**
 * 개
 *
 * @author : Heum
 */
public class Dog extends Animal {

    @Override
    public void bark() {
        System.out.println("멍멍");
    }

    public static void eat(String food) {
        System.out.println("Dog eat " + food);
    }
}
