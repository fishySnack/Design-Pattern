package Design.FactoryPattern;

public class Worker implements Person {
    private String name;
    private double income;

    public Worker(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public Worker() {

    }

    public Worker setName(String name) {
        this.name = name;
        return this;
    }

    public Worker setIncome(double income) {
        this.income = income;
        return this;
    }

    @Override // required
    public void speak() {
        System.out.println("I am employed!");
    }

}
