
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "John", "Doe", 25);


        Person person2 = new Person("Alice", "Smith");


        Person person3 = new Person(3);


        Person person4 = new Person();


        System.out.println("Person 1: " + person1.getId() + " " + person1.getFirstName() + " " + person1.getLastName() + " " + person1.getAge());
        System.out.println("Person 2: " + person2.getId() + " " + person2.getFirstName() + " " + person2.getLastName() + " " + person2.getAge());
        System.out.println("Person 3: " + person3.getId() + " " + person3.getFirstName() + " " + person3.getLastName() + " " + person3.getAge());
        System.out.println("Person 4: " + person4.getId() + " " + person4.getFirstName() + " " + person4.getLastName() + " " + person4.getAge());
    }
    }
