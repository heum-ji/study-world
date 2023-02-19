package hijava.basic;


import java.util.Objects;

/**
 * Cloneable : Maker Interface
 */
public class Student implements Cloneable, Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }

    // s1.equals(s2)
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; // 동일한 메모리 주소면 true

        // this는 절대 null이 될 수 없으므로 o가 null 이면 false!!
        // 동일한 class type이 아니면 false
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clobj = (Student) super.clone();
        clobj.name += " 복제본!";
        return clobj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        StringBuilder sb = new StringBuilder();
        sb.append("aaaaaaaa");
        System.out.println("sb1 = " + sb.toString());
        sb.setLength(0);
        System.out.println("sb2 =" + sb.toString());

        // StringBuffer = thread-safe : synchronized

        //        Student s = new Student(921234, "홍길동");
        //        Student s2 = (Student) s.clone(); // RunTime 중에 에러 발생 - Cloneable implement 해야 함
        //        System.out.println(s2);
        //        System.out.println(s);
        //        String ss = new String("홍길동1");
        //        Integer obj = s.id;
        //        Integer obj2 = 921234;
        //        // String이랑 primitive 변수는 값이 같으면 주소가 같음
        //        System.out.println(s.name.hashCode() + "::" + ss.hashCode());
        //        System.out.println(obj.hashCode() + "::" + obj2.hashCode()); // Integer는 값이 나옴
        //        System.out.println(System.identityHashCode(obj2)); // 주소는 실제 주소 가져와야 함
        //
        //        Student s1 = new Student(123, "Hong");
        //        Student s2 = new Student(456, "Kim");
        //        Student s3 = new Student(123, "Hong");
        //        System.out.println("s1 equals s2 = " + s2.equals(s1)); // false
        //        System.out.println("s1 equals s3 = " + s3.equals(s1)); // true
    }

    /**
     * TreeSet 사용시 항상 Comparable implements 해서 compareTo 메서드 Override 해야 함
     * 
     * @param o the object to be compared.
     *
     * @return
     */
    @Override
    public int compareTo(Student o) {
        System.out.println("comp=" + this.id + "-" + o.id);
        return this.id - o.id;
    }
}
