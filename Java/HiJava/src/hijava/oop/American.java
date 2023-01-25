package hijava.oop;

import hijava.practice.Man;

/**
 * 미국사람
 *
 * @author : Heum
 */
public class American extends Man {

    public American(String name) {
        this.setName(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
        System.out.println("My name is " + this.getName() + ".");
    }

    public void eatBread() {
        System.out.println("Eating Bread!!");
    }
}
