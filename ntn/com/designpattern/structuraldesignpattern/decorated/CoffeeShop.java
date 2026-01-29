package ntn.com.designpattern.structuraldesignpattern.decorated;

public class CoffeeShop {

    public static void main(String[] args) {

        Coffee plainCoffee = new SimpleColdCoffee();

        System.out.println(plainCoffee.getDescription() + " : " +plainCoffee.cost());

        Coffee coffeeWithIceCream = new ColdCoffeeWithIceCream(plainCoffee);

        System.out.println(coffeeWithIceCream.getDescription() + ": "+coffeeWithIceCream.cost());



    }
}
