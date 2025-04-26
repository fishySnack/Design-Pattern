package Design.BuilderPattern;

public class StudentBuilder {
    private String studentName;
    private int age;
    private Long id;
    private double tuitionCost;

    public StudentBuilder setName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setTuition(Double tuitionCost) {
        this.tuitionCost = tuitionCost;
        return this;
    }

    public Student build() {
        return new Student(studentName, age, id, tuitionCost);
    }
}
