package hijava.basic;

/**
 * 익명 클래스 연습
 */
public class OutIn {

    Runnable getRun(int cnt) {
        int start = 0;

        return new Runnable() { // Thread로 실행

            @Override
            public void run() {
                int sum = 0;
                for (int i = start; i <= cnt; i++) {
                    sum += i;
                }
                System.out.println("sum = " + sum);
            }
        };
    }

    public static void main(String[] args) {
        OutIn oi = new OutIn();
        Runnable r = oi.getRun(100);
        r.run();
    }
}
