package hijava.practice;

/**
 * Try This : 학생 클래스 만들어보기
 *
 * @author : Heum
 */
public class Student {
    // 멤버 변수 : 학번, 성명, 나이, 전화번호
    private String studentNo;
    private String name;
    private int age;
    private String telNo;

    // 이름을 입력받는 생성자
    public Student(String name) {
        this.name = name;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelNo() {
        return this.telNo == null || this.telNo.length() < 4 ? this.telNo : this.telNo.substring(0, this.telNo.length() - 4) + "****";
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", telNo='" + this.getTelNo() + '\'' +
                '}';
    }

}
