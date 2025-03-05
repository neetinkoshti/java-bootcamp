package com.ntn.javaconcepts.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSort {

    public static void main(String[] args) {

        Employee e1 = new Employee("ravi" , 30);
        Employee e2 = new Employee("shyam" , 23);
        Employee e3 = new Employee("sundar" , 33);
        Employee e4 = new Employee("hari" , 31);

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4);

        System.out.println("Employees list without sorting");
        System.out.println(employees);

        Collections.sort(employees);
        System.out.println("Employees list with Names using Comparable");
        System.out.println(employees);


        Comparator<Employee> compareByAge =(e5,e6) -> e5.getAge() > e6.getAge() ? 1 : (e5.getAge() < e6.getAge() ? -1 :0 );

        Collections.sort(employees,compareByAge);
        System.out.println("Employees list with sorting - by age using collections util method");
        System.out.println(employees);

        List<Employee> sortedList = employees.stream()
                .sorted(compareByAge)
                .collect(Collectors.toList());

        System.out.println("Employees list with sorting by age");
        System.out.println(sortedList);

        List<Employee> sortedWithInbuiltMethod =employees.stream()
                .sorted(Comparator.comparing(Employee::getAge)
                .reversed())
                .collect(Collectors.toList());
        System.out.println("Employees list with sorting by age with Inbuilt methods");
        System.out.println(sortedWithInbuiltMethod);
    }
}

class Employee implements Comparable{

    String name;
    int age;

    public Employee(String name, int age){
        this.name =name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        Employee e = (Employee) o;
        return getName().compareTo(e.getName());
    }
}
