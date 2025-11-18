import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the car's make: ");
        String make = scanner.nextLine();

        System.out.println("Enter the car's model: ");
        String model = scanner.nextLine();

        System.out.println("Enter the car's year: ");
        int year = scanner.nextInt();

        Car car = new Car(make, model, year);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        System.out.println("Enter the updated year: ");
        int updatedYear = scanner.nextInt();
        car.setYear(updatedYear);

        System.out.println("Updated car's year: " + car.getYear());
    }
}
