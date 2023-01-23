package hijava.practice;

/**
 * Class 구현
 * default : 내부클래스 및 같은 패키지에서 사용 가능(아무것도 적지 않은 경우)
 *
 * @author : Heum
 */
public class Person {
    // public : 어디서든 사용
    public static final String KOREAN = "사람";
    public String name;
    // protected 상속하거나, 같은 패키지, 내부 클래스에서 사용
    protected String tel;
    // 내부 클래스에서만 사용 가능
    private String ssn1;
    private String ssn2;

    public Person(String name) { // 생성자 (Constructor)
        this.name = name;
    }

    public void setTel(String tel) { // setter
        this.tel = tel;
    }

    public String getSsn() { // getter
        return ssn1 + "*******";
    }
}
