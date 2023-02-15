package hijava.oop;

public class Oper {
    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public void mul(int x, int y) {
        int result = 0;

        for (int i = 0; i < y; i++) {
            result = add(result, x);
        }

        System.out.println(result);
    }

    public void div(int x, int y) {
        int result = 0;

        while (x > 0) {
            result++;
            x -= y;
        }

        System.out.println(result);
    }

}
