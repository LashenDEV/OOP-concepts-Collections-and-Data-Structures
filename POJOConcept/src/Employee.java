public class Employee {
    private String id;
    private String name;
    private String dateOfBirth;
    private String companyName;

    public Employee(String id, String name, String dateOfBirth, String companyName) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
