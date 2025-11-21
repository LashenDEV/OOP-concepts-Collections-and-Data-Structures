public class Car extends Vehicle {
    private int NumberOfDoors;
    private int horsePower;

    public Car(){
        super("CIVIC", 2023, "Honda");
    }

    public Car(String company, int year){
        this(company, year, 4, 9);
    }

    public Car(String company, int year, int numberOfDoors, int horsePower) {
        super(company, year,  year > 2022 ? company + " " + "Latest Model" : (year < 2020 ? company+ " Previous Model" : company + " Old Model"));
        this.NumberOfDoors = numberOfDoors;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumberofDoors=" + NumberOfDoors +
                ", horsePower=" + horsePower +
                "} " + super.toString();
    }

    public void service(int month){
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Car starts, run on road and work their engine");
    }
}
