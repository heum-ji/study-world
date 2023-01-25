package hijava.oop;

import hijava.practice.Man;

import java.util.ArrayList;

/**
 * OOP Main
 *
 * @author : Heum
 */
public class Main {

    public static void main(String[] args) {
        //al();
        //momAndSon();
        //koreanAndAmerican();
        //drinkTest();
        eatTest();
    }

    private static void eatTest() {
        Man korean = new Korean("홍길동");
        Man american = new American("John");

        eat(american);
    }

    private static void eat(Man m) {
        if (m instanceof Korean) {
            ((Korean) m).eatRice();
        } else if (m instanceof American) {
            ((American) m).eatBread();
        } else {
            System.out.println("해당 인스턴스가 없습니다!!");
        }
    }

    private static void koreanAndAmerican() {
        Korean korean = new Korean("홍길동");
        Man american = new American("John");

        sayHi(korean);
        sayHi(american);
    }

    private static void sayHi(Man man) {
        man.sayHello();
    }

    private static void momAndSon() {
        Mom mom = new Mom();
        Son son = new Son(); // 다형성 : 자식은 부모의 Type으로 선언 가능 <-> 반대는 불가 ex) Son mom = new Mom();

//        mom.eat();
//        son.eat();
        eat(mom);
        eat(son);

//        mom.say();
//        son.say(); // 부모의 Type으로 생성해도, 본인 메서드 우선순위!
    }

    private static void eat(Mom m) {
        if (m instanceof Son) { // 상속한 경우 판단하기 어려움 - 자식단위부터 필터링하는것이 좋음
            System.out.println("먹어~");
        } else if (m instanceof Mom) {
            System.out.println("드세요~");
        } else {
            System.out.println("드십시오!");
        }
    }

    private static void drinkTest() {
        Mom mom = new Mom();
        Mom son = new Son();

        drink(mom);
        drink(son);
    }

    private static void drink(Mom m) {
        if (m instanceof Son) { // 상속한 경우 판단하기 어려움 - 자식단위부터 필터링하는것이 좋음
            ((Son) m).drinkMilk();
        } else {
            m.drinkBeer();
        }
    }

    private static void al() {
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
