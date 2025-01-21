package ntn.com.javaconcepts;

/**
 *  while overriding a method from parent to child , make sure its access specifier can be same or above
 *  parent class - default
 *  child class - default, protected , public
 *
 *  parent class - protected
 *  child class - protected, public
 *
 *  parent class - public
 *  child class - public only
 */
public class AbstratClassDemo {

    public static void main(String[] args) {
        A obj = new B();
        ((AbstractDemo)obj).display();
    }
}

abstract class AbstractDemo{

    protected static int num = 5 ;
      abstract void display();
}

class A extends AbstractDemo{

    int numA = 10 ;
    @Override
    public void display() {
        System.out.println("Display A");
        System.out.println(num + " - "+numA);
    }
}

class B extends A{
    public void show(){
        System.out.println("print show");
    }
}


