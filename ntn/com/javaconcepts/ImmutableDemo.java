package ntn.com.javaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *  Key points to be remember in case of immutable class
 *  1. class should be final ,so other class can not extend this class
 *  2. instance variables should be private and final
 *  3. there should not be any setter method , who can change the properties from outside of the class
 *  4. if class has any instance variable , which are mutable ,
 *  then we should be returning a clone of this variable , instead original
 *  5. there should be only getter method which return instance variable
 */
public class ImmutableDemo {

    public static void main(String[] args) {

        Immutable obj = new Immutable(101,"Nitin",new Date() , Arrays.asList("Java","Microservices","RestAPI","Kafka","Spring boot"));

        System.out.println("Object Before state change : "+obj);
        obj.getDateOfBirth().setTime(21);
        System.out.println("Object After  state change : DOB updated : "+obj);
        List<String> skills = obj.getSkills();
        skills.add("Hibernate");
        skills.add("Oracle");
        obj.getSkills().addAll(skills);
        System.out.println("Object After  state change : Skills updated : "+obj);
    }
}

/**
 *  Output : with handling mutable instance variable
 *  Object Before state change : Immutable{id=101, name='Nitin', dateOfBirth=Tue Jan 21 12:45:27 IST 2025, skills=[Java, Microservices, RestAPI, Kafka, Spring boot]}
 *  Object After  state change : DOB updated : Immutable{id=101, name='Nitin', dateOfBirth=Tue Jan 21 12:45:27 IST 2025, skills=[Java, Microservices, RestAPI, Kafka, Spring boot]}
 *  Object After  state change : Skills updated : Immutable{id=101, name='Nitin', dateOfBirth=Tue Jan 21 12:45:27 IST 2025, skills=[Java, Microservices, RestAPI, Kafka, Spring boot]}
 *
 *  Output : without handling mutable instance variable
 *
 *  Object Before state change : Immutable{id=101, name='Nitin', dateOfBirth=Tue Jan 21 12:54:01 IST 2025, skills=[Java, Microservices, RestAPI, Kafka, Spring boot]}
 * Object After  state change : DOB updated : Immutable{id=101, name='Nitin', dateOfBirth=Thu Jan 01 05:30:00 IST 1970, skills=[Java, Microservices, RestAPI, Kafka, Spring boot]}
 * Object After  state change : Skills updated : Immutable{id=101, name='Nitin', dateOfBirth=Thu Jan 01 05:30:00 IST 1970, skills=[Java, Microservices, RestAPI, Kafka, Spring boot]}
 *
 */

final class Immutable{

    private final int id;
    private final String name;
    private final Date dateOfBirth;
    private List<String> skills;

    public Immutable(int id, String name, Date dateOfBirth, List<String> skills) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
//        return dateOfBirth;
    }

    public List<String> getSkills() {
        return new ArrayList<>(skills);
//        return skills;
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", skills=" + skills +
                '}';
    }
}



