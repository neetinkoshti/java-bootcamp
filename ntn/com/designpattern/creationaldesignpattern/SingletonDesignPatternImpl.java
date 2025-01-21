package ntn.com.designpattern.creationaldesignpattern;

import java.io.*;
import java.sql.Time;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *  Singleton Design Pattern
 *  1. Constructor should be private
 *  2. getInstance method should be public and it should initialize obj
 *
 */


public class SingletonDesignPatternImpl {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Eager Initialization
        singletonPatternUsingEagerInitialization();

        // Lazy Initialization
        singletonPatternUsingLazyInitialization();

        // Thread Safe
        singletonPatternUsingThreadSafety();

        // Using Serialization and Deserialization
        singletonPatternUsingSerialization();

        //Java Inbuilt classes which implements singleton pattern
        javaInbuiltClassesUsingSingletonPattern();


    }

    private static void javaInbuiltClassesUsingSingletonPattern() {

        Runtime instance1 = Runtime.getRuntime();
        Runtime instance2 = Runtime.getRuntime();

        System.out.println("Runtime Inbuilt class : check the instances : instance 1 -" + instance1);
        System.out.println("Runtime Inbuilt class : check the instances : instance 2 -"+ instance2);

        TimeZone timeZoneInstance1 = TimeZone.getDefault();
        TimeZone timeZoneInstance2 = TimeZone.getDefault();

        System.out.println("TimeZone Inbuilt class : check the instances : instance 1 -" + timeZoneInstance1.hashCode());
        System.out.println("TimeZone Inbuilt class : check the instances : instance 2 -"+ timeZoneInstance2.hashCode());
    }

    private static void singletonPatternUsingSerialization() throws IOException, ClassNotFoundException {

        System.out.println("Using Serialization Method");

        SingletonPattern.SingletonPatternUsingSerialization instance1 = SingletonPattern.SingletonPatternUsingSerialization.getInstance();
        // Serialized it first instance
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("serialized.ser"));
        outputStream.writeObject(instance1);
        outputStream.close();

        // Now Deserialized above object
        SingletonPattern.SingletonPatternUsingSerialization instance2 ;
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("serialized.ser"));
        instance2 = (SingletonPattern.SingletonPatternUsingSerialization) inputStream.readObject();


        System.out.println("Serialized : check the instances : instance 1 -" + instance1);
        System.out.println("Deserialized : check the instances : instance 2 -"+ instance2);




    }

    private static void singletonPatternUsingThreadSafety() {
        System.out.println("Using Thread Safety Method");

        Thread t1 = new Thread(()-> {
            System.out.println("Thread 1:"+ Thread.currentThread().getName());
            SingletonPattern.SingletonPatternUsingThreadSafety instance1 = SingletonPattern.SingletonPatternUsingThreadSafety.getInstance();
            System.out.println("Thread Safety check : check the instances : instance 1 -" + instance1);
        });
        Thread t2 = new Thread(()-> {
            System.out.println("Thread 2:"+ Thread.currentThread().getName());
            SingletonPattern.SingletonPatternUsingThreadSafety instance2 = SingletonPattern.SingletonPatternUsingThreadSafety.getInstance();
            System.out.println("Thread Safety check : check the instances : instance 2 -" + instance2);
        });

        Thread t3 = new Thread(()-> {
            System.out.println("Thread 3:"+ Thread.currentThread().getName());
            SingletonPattern.SingletonPatternUsingThreadSafety instance3 = SingletonPattern.SingletonPatternUsingThreadSafety.getInstance();
            System.out.println("Thread Safety check : check the instances : instance 3 -" + instance3);
        });

        t1.start();
        t2.start();
        t3.start();

    }

    private static void singletonPatternUsingLazyInitialization() {
        System.out.println("Using Lazy Initialization Method");
        SingletonPattern.SingletonPatternUsingLazyInitialization instance1 = SingletonPattern.SingletonPatternUsingLazyInitialization.getInstance();
        SingletonPattern.SingletonPatternUsingLazyInitialization instance2 = SingletonPattern.SingletonPatternUsingLazyInitialization.getInstance();
        SingletonPattern.SingletonPatternUsingLazyInitialization instance3 = SingletonPattern.SingletonPatternUsingLazyInitialization.getInstance();

        System.out.println("Lazy : check the instances : instance 1 -" + instance1);
        System.out.println("Lazy : check the instances : instance 2 -"+ instance2);
        System.out.println("Lazy : check the instances : instance 3 -"+ instance3);
    }

    private static void singletonPatternUsingEagerInitialization() {

        System.out.println("Using Eager Initialization Method");
        SingletonPattern.SingletonPatternUsingEagerInitialization instance1 = SingletonPattern.SingletonPatternUsingEagerInitialization.getInstance();
        SingletonPattern.SingletonPatternUsingEagerInitialization instance2 = SingletonPattern.SingletonPatternUsingEagerInitialization.getInstance();
        SingletonPattern.SingletonPatternUsingEagerInitialization instance3 = SingletonPattern.SingletonPatternUsingEagerInitialization.getInstance();


        System.out.println("Eager : check the instances : instance 1 -" + instance1);
        System.out.println("Eager : check the instances : instance 2 -"+ instance2);
        System.out.println("Eager : check the instances : instance 3 -"+ instance3);

    }
}

class SingletonPattern{

    static class SingletonPatternUsingEagerInitialization{

        private static final SingletonPatternUsingEagerInitialization obj = new SingletonPatternUsingEagerInitialization();

        private SingletonPatternUsingEagerInitialization(){

        }

        public static SingletonPatternUsingEagerInitialization getInstance(){
            return obj;
        }
    }

    static class SingletonPatternUsingLazyInitialization{

        private static SingletonPatternUsingLazyInitialization obj ;

        private SingletonPatternUsingLazyInitialization(){

        }

        public static SingletonPatternUsingLazyInitialization getInstance(){
            if(obj ==null)
                obj = new SingletonPatternUsingLazyInitialization();
            return obj ;
        }
    }

    static class SingletonPatternUsingThreadSafety{

        private static SingletonPatternUsingThreadSafety obj ;

        private SingletonPatternUsingThreadSafety(){

        }

        public static SingletonPatternUsingThreadSafety getInstance(){

            if(obj==null){
                synchronized (SingletonPatternUsingThreadSafety.class){
                    if(obj ==null){
                        obj = new SingletonPatternUsingThreadSafety();
                    }
                }
            }
            return obj;
        }
    }

    static class SingletonPatternUsingSerialization implements Serializable {

        private static final long serialVersionUId = 1L;

        private static SingletonPatternUsingSerialization obj ;

        private SingletonPatternUsingSerialization(){

        }

        public static SingletonPatternUsingSerialization getInstance(){
            if(obj ==null){
                obj = new SingletonPatternUsingSerialization();
            }
            return obj;
        }

        protected Object readResolve(){
            return getInstance();
        }

    }
}
