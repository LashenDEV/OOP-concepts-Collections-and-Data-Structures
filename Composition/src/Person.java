public class Person  {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    private String rollNumber;

    public Student(String name, Address address, String rollNumber) {
        super(name, address);
        this.rollNumber = rollNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }
}

class Professor extends Person {
    private String salary;

    public Professor(String name, Address address, String salary) {
        super(name, address);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }
}