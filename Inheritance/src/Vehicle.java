public class Vehicle {
    private String model;
    private int    year;
    private String company;

    public Vehicle(){

    }

    public Vehicle(String model, int year, String company) {
        this.model = model;
        this.year = year;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model=" + model + ", year=" + year + ", company=" + company + '}';
    }

    public void move(String speed){
        System.out.println(model + " moves " + speed);
    }

    public void service(int month){
        System.out.println(model + " needs servicing every " + month + " months");
    }
}
