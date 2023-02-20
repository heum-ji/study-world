package hijava.basic;

/**
 * Inner Class 연습
 */
public class Outer {
    private int id;
    private String name;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callIn() {
        Inner inner = new Inner();
        inner.in();
    }

    class Inner {
        public void in() {
            System.out.println("inner class >> name = " + name);
        }
    }

    static class StaticInner {
        static String inStr = "Static Inner inStr";

        public static void in() {
            System.out.println("static inner class >> name = " + inStr);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.setName("Hong");

        System.out.println("outer.name = " + outer.getName());
        outer.callIn();

        StaticInner.in();
        //Inner inner = new Inner(); // fail !! (: outer가 먼저 생성되어야 함!!)
    }
}
