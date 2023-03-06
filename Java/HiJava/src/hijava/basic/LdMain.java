package hijava.basic;

/**
 * 람다 실습 메인 클래스
 */
public class LdMain {

    public static void main(String[] args) {
        //        ld1();
        //        ld2();
        ldCalc();
    }

    private static void ldCalc() {
        LdCalc add = (x, y) -> x + y;
        LdCalc sub = (x, y) -> x - y;
        LdCalc mul = (x, y) -> x * y;
        LdCalc div = (x, y) -> x / y;

        System.out.println("add = " + add.oper(10, 20));
        System.out.println("sub = " + sub.oper(10, 20));
        System.out.println("mul = " + mul.oper(10, 20));
        System.out.println("div = " + div.oper(10, 20));
    }

    private static void ld2() {
        // 구현체가 매번 다를 수 있음
        LdStudent ls1 = (id, name) -> new Student(id, name);


        LdStudent ls2 = (id, name) -> new Student(id * 1000, name + "님");

        stufn(ls1, 100, "Hong");
        stufn(ls2, 200, "Kim");
    }

    private static void stufn(LdStudent ls, int id, String name) {
        Student stu = ls.makeStudent(id, name);
        System.out.println(stu);
    }

    private static void ld1() {
        Ld ld = (x, y) -> x * y;
        //        public int fn(int x, int y) {
        //            return x * y;
        //        }

        int result = ld.mul(10, 20);
        System.out.println("result = " + result);
    }

}
