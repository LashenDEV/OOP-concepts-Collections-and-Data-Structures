public class MainClass extends  Object {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 18);
        System.out.println(employee);

        experiencedEmployee experiencedEmployee = new experiencedEmployee("Alice", 18, "EN109");
        System.out.println(experiencedEmployee);
    }
}

class Employee {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class experiencedEmployee extends Employee {
    private String employeeId;

    experiencedEmployee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return employeeId + " Experienced Employee " + super.toString();
    }
}