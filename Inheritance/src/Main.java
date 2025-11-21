public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Camry", 2022, "Toyota");
        doVehicleStuff(vehicle, "Fast", 1);

        Car car = new Car("Honda", 2023, 2, 1000);
        doVehicleStuff(car, "Fast", 2);

        Car audi = new Car("Audi", 2019);
        doVehicleStuff(audi, "Fast", 2);

        Car tesla = new Car("Tesla", 2023, 4, 2000);
        doVehicleStuff(tesla, "Super Fast", 1);
    }

    public static void doVehicleStuff(Vehicle vehicle, String speed, int month){
        vehicle.service(month);
        vehicle.move(speed);
        System.out.println(vehicle);
        System.out.println("_______");
    }
}
