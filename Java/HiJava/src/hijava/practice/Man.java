package hijava.practice;

/**
 * 제목
 *
 * @author : Heum
 */
public class Man {
    public static final int COFFEE = 3000; // 커피 값 설정 (상수)
    public static final int DONUT = 2500; // 도넛 값 설정 (상수)

    private String name;    // 이름
    private int amount;     // 잔액

    // 초기 잔액 10,000 설정
    public Man() {
        this.amount = 10000;
    }

    public Man(String name) {
        this(); // 생성자 호출
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void buyCoffee(int count) {
//        this.amount -= COFFEE * count;
        this.subAmout(COFFEE, count);
    }

    public void buyDonut(int count) {
        this.subAmout(DONUT, count);
    }

    // refactoring : 구매처리 : 언제든지 가격과 갯수만 주면 처리됨
    private void subAmout(int price, int count) {
        this.amount -= price * count;
    }

    @Override
    public String toString() {
        return this.name + "님의 잔액은 " + this.amount + "원 입니다.";
    }

    public static void main(String[] args) {
        Man hong = new Man("Hong");
        Man john = new Man("John");

        hong.buyCoffee(1);  // 3,000
        hong.buyDonut(2);   // 5,000

        john.buyCoffee(2); // 6,000
        john.buyDonut(1);  // 2,500

        System.out.println(hong); // 10,000 - 8,000 = 2,000
        System.out.println(john); // 10,000 - 8,500 = 1,500
    }
}
