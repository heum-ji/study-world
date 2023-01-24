package hijava.oop;

import hijava.practice.Man;

import java.util.ArrayList;

/**
 * ArrayList
 *
 * @author : Heum
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Man> people = new ArrayList<>(9); // 미리 사이즈를 선언해서 메모리를 확보해 둘 수 있음

        for (int i = 0; i < 9; i++) {
            Man m = new Man("김" + (i + 1) + "수");

            people.add(m);

            m.buyCoffee(1);
        }

        int size = people.size();

        for (int i = 0; i < size; i++) {
            System.out.println(people.get(i));
        }
    }
}
