package Design.BuilderPattern;

public class Student {
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
}
