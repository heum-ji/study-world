package hijava.basic;

import hijava.practice.Man;

/**
 * Generic 연습
 */
public class Person<T> {
    private T person;

    public void set(T person) {
        this.person = person;
    }

    public String getName() {
        return this.person.toString();
    }

    public static void main(String[] args) {
        Man man = new Man("Man");
        Student student = new Student(100, "Hong");

        Person<Man> manPerson = new Person<>();
        manPerson.set(man);
        System.out.println("manPerson : " + manPerson.getName());

        Person<Student> studentPerson = new Person<>();
        studentPerson.set(student);
        System.out.println("studentPerson : " +studentPerson.getName());
    }
}
