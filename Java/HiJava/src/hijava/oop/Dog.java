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

    // String화 될 때 호출 됨 - Object
    @Override
    public String toString() {
        return "This is Dog";
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d);

        String s = "Test : " + d;
        System.out.println(s);
    }
}
