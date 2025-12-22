import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
//        Fruit fruit = Fruit.getFruit("Apple", "Honey Crisp");
//        fruit.isRipe("Ripped");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter type (A for Apple, B for Banana, " + "or Q to quit)");
            String type = sc.nextLine();

            if("Qq".contains(type)){
                break;
            }

            System.out.println("Enter the fruit Title: ");
            String name = sc.nextLine();
            Fruit fruit = Fruit.getFruit(type, name);
            fruit.isRipe("Ripped");
        }
    }
}

