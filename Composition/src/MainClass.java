public class MainClass {
    public static void main(String[] args) {
        Address address = new Address("5th Ave 32nd floor", "New York", "United State");

        Student student = new Student("John Doe", address,"A201");

        System.out.println("Student Roll No: " + student.getRollNumber() +
                "\nName: " + student.getName() +
                "\nCity: " + address.getCity() +
                "\nStreet: " + address.getStreet() +
                "\nState: " + address.getState());

        System.out.println("-----------------------");

        Professor professor = new Professor("John Doe",
                address,
                "20000$");

        System.out.println("Professor Salary: " + professor.getSalary() +
                "\nName: " + professor.getName() +
                "\nCity: " + address.getCity() +
                "\nStreet: " + address.getStreet() +
                "\nState: " + address.getState());
    }
}
