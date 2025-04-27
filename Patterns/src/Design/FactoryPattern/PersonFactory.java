package Design.FactoryPattern;

import Design.BuilderPattern.Student;

public class PersonFactory {
    private String name;
    private Double income;

    public Unemployed creatUnemployed(String name) {
        return new Unemployed(name);
    }

    public Worker creatWorker(String name, Double income) {
        return new Worker(name, income);
    }

    public static Person createPerson(String type) {
        if (type.equalsIgnoreCase("student"))
            return new Student();
        else if (type.equalsIgnoreCase("worker"))
            return new Worker();
        else if (type.equalsIgnoreCase("unemployed"))
            return new Unemployed();
        else {
            throw new IllegalArgumentException();
        }
    }
}
