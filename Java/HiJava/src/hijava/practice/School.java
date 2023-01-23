package hijava.practice;

/**
 * 학교 (Student + Score)
 * getter / setter 사용하는 이유 : 정보의 은닉성
 * public으로 접근이 바로 가능하지만, getter/setter 사용 시 권한 등 조건에 따라서 다르게 데이터를 접근 및 처리 가능
 *
 * @author : Heum
 */
public class School {

    public static void main(String[] args) {
        Score korean = new Score();
        korean.setSubject("국어");
        korean.setScore(90);

        Score math = new Score("수학", 80);

        Score science = new Score("과학");
        
        System.out.println(korean); // 객체를 전달하면 toString() 호출해줌
        System.out.println(math);
        System.out.println(science);
    }
}
