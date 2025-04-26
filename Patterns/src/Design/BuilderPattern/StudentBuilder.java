package Design.BuilderPattern;

public class StudentBuilder {
    private String studentName;
    private int age;
    private Long id;
    private double tuitionCost;

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTuition(Double tuitionCost) {
        this.tuitionCost = tuitionCost;
    }

    public Student build() {
        return new Student(studentName, age, id, tuitionCost);
    }
}
