package ntn.com.designpattern.structuraldesignpattern.decorated;

public class ColdCoffeeWithIceCream extends CoffeeDecorator{


    public ColdCoffeeWithIceCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "with IceCream";
    }

    @Override
    public double cost() {
        return super.cost() + 30;
    }
}
