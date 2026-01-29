package ntn.com.designpattern.structuraldesignpattern.decorated;

public class SimpleColdCoffee implements Coffee{


    @Override
    public String getDescription() {
        return "Plain Cold coffee";
    }

    @Override
    public double cost() {
        return 100;
    }
}
