package Design.BuilderPattern;

import Design.FactoryPattern.Person;

public class Student implements Person {
    private String studentName;
    private int age;
    private Long id;
    private double tuitionCost;

    public Student(String studentName, int age, Long id, double tuitionCost) {
        this.studentName = studentName;
        this.age = age;
        this.id = id;
        this.tuitionCost = tuitionCost;
    }

    public Student() {

    }

    @Override // implementation
    public String toString() {
        return "Student's name: " + studentName + " age: " + age +
                " ID: " + id + " Tuition Cost " + tuitionCost;
    }

    @Override // required
    public void speak() {
        System.out.println("I am a student");
    }
}
