package Design.FactoryPattern;

public class Unemployed implements Person {
    private String name;

    public Unemployed(String name) {
        this.name = name;
    }

    public Unemployed() {

    }

    public Unemployed setName(String name) {
        this.name = name;
        return this;
    }

    @Override // required
    public void speak() {
        System.out.println("I am unemployed!");
    }
}
