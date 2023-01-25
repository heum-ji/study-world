package hijava.oop;

/**
 * 엄마 클래스
 *
 * @author : Heum
 */
public class Mom {
    private String name;

    public Mom(String name) {
        this.name = name;
    }

    public Mom() {
        this("엄마");
    }

    // 모든 메서드는 기본적으로 this를 매개변수로 가지고 있음 (생략) - 모든 클래스는 Object 상속과 같음
    public String getName() {
        return this.name;
    }

    public void drinkBeer() {
        System.out.println("맥주를 마셔요~");
    }

    public void eat() {
        System.out.println("EAT!!");
    }

    // protected : 상속받은곳 + 같은 패키지에서 사용가능
    protected void say() {
        System.out.println("Mom said...");
    }
}
