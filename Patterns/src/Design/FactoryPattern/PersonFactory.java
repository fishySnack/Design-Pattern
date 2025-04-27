package Design.FactoryPattern;

import Design.BuilderPattern.Student;

public class PersonFactory {

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

    public static Student createStudent(String name) {
        return new Student();
    }

    public static Worker createWorker(String name, double income) {
        return new Worker(name, income);
    }

    public static Unemployed createUnemployed(String name) {
        return new Unemployed(name);
    }
}
