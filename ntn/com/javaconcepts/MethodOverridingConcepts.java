package ntn.com.javaconcepts;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverridingConcepts {

    public static void main(String[] args) {

    }
}

class Parent {

    void m1(){
        System.out.println("Parent m1");
    }

    protected Number m2(){
        System.out.println("Parent m2");
        return null;
    }

    public void m3() throws NullPointerException{
        System.out.println("Parent m3");
    }

    public void m4() throws IOException {
        System.out.println("Parent m4");
    }
}

class Child extends Parent{

    /**
     *  Access Specifier : this can have protected , default and public
     */
    @Override
    protected void m1() {
        System.out.println("child m1");
    }

    /**
     *  Access Specifier : this can have protected or public only
     *  Return Type : this can be Number or subclass of Number like Integer
     */
    @Override
    public Integer m2() {
        System.out.println("Child m2");
        return null;
    }

    /**
     *  Exception : this can throws only Unchecked Exception like RuntimeException , NPE
     *      or No Exception at all , but can not throw checked Exception
     */
    @Override
    public void m3() throws RuntimeException {
        System.out.println("Child m3");
    }

    /**
     *  Exception : this can throw No Exception OR unchecked Exception OR same IOException
     *      OR any child class of IOException like FileNotFoundException
     *      but can not throw parent checked Exception
     */
    @Override
    public void m4() throws FileNotFoundException {
        System.out.println("Child m4");
    }
}
