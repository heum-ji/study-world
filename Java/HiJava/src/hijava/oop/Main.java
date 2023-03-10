package hijava.oop;

import hijava.practice.Man;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * OOP Main
 * 상속성 : extends
 * 은닉성 : getter / setter
 * 다형성 : abstract / interface
 *
 * @author : Heum
 */
public class Main {

    public static void main(String[] args) throws SQLException {

//        netSport();
//        animal();
//        weight();
//        AbstSuper sp = new AbstChild();
//        int i = 5;
//        int j = 10;
//
//        System.out.println("min = " + sp.min(i, j) + ", max = " + sp.max(i, j));

//        al();
//        momAndSon();
//        koreanAndAmerican();
//        drinkTest();
//        eatTest();
//        softWare();
//        calculator();
//        testInterface();
//        total();
//        calcOper();
        scanner2();
    }

    private static void scanner2() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String ret = inputScan(scanner, "계산하시겠어요? (계산:enter, 종료:quit)");

            if ("quit".equals(ret)) {
                break;
            }

            int x = inputScanNumber(scanner, "첫번째 숫자(x)를 입력하세요>> ");
            int y = inputScanNumber(scanner, "두번째 숫자(y)를 입력하세요>> ");

            String op = inputScan(scanner, "연산자(* 또는 /)를 입력하세요>> ");

            CalcOper co = new CalcOper();
            System.out.print(x + " " + op + " " + y + " = ");

            if ("*".equals(op)) {
                co.mul(x, y);

            } else if ("/".equals(op)) {
                co.div(x, y);

            } else {
                System.out.println("연산자를 정확히 입력하세요!!");
            }
        }
        scanner.close();
    }


    private static int inputScanNumber(Scanner scanner, String msg) {
        return Integer.parseInt(inputScan(scanner, msg));
    }

    private static String inputScan(Scanner scanner, String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    private static void calcOper() {
        CalcOper op = new CalcOper();
        int x = 10;
        int y = 5;

        int a = op.add(x, y);
        int s = op.sub(x, y);
        System.out.println(a + ", " + s);
        op.mul(x, y);
        op.div(x, y);
    }

    private static void total() {
        int[] arr = new int[]{1, 2, 5, 9};

        SubTotal st = new SubTotal();
        System.out.println("Total=" + st.sum(arr));
    }

    private static void testInterface() throws SQLException {
        TestInterface ti = new TestImpl();
        ti.select("SELECT * FROM table");
        TestInterface.out(100);

        Dog.eat("Meat");
    }

    private static void calculator() {
        Calculator calc = new CalculatorImpl();

        int x = 10;
        int y = 5;
        calc.add(x, y);
        calc.div(x, y);
        calc.div(x, 0);

    }

    private static void softWare() {
        SoftWare site = new WebSite();
        SoftWare app = new MobileApp();

        String s = "abc";

        site.product();
        app.product();
    }

    private static void netSport() {
        NetSport pp = new PingPong();
        NetSport te = new Tennis();

        pp.play();
        System.out.println("==========");
        te.play();
    }

    private static void animal() {
        Animal dog = new Dog();
        Animal cat = new Cat();

        barkAnimal(dog);
        barkAnimal(cat);
    }

    private static void barkAnimal(Animal ani) {
        ani.bark();
    }

    private static void weight() {
        Weight guen = new Guen();
        Weight pound = new Pound();

        int cnt = 5;
        System.out.println("Guen = " + guen.getGram(cnt));
        System.out.println("Pound = " + pound.getGram(cnt));
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
