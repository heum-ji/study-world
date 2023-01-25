package hijava.oop;

import hijava.practice.Man;

/**
 * 한국사람
 *
 * @author : Heum
 */
public class Korean extends Man {

    public Korean(String name) {
        this.setName(name);
    }

    public void eatRice() {
        System.out.println("밥을 먹습니다.");
    }
}
