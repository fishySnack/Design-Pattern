package Design.FactoryPattern;

public class Worker implements Person {
    private String name;
    private double income;

    public Worker(String name, double income) {
        this.name = name;
        this.income = income;
    }

    @Override // required
    public void speak() {
        System.out.println("I am employed!");
    }

}
