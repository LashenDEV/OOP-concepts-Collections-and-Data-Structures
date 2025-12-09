public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            NCEmployee employee = new NCEmployee(
                    "EN" + i,
                    switch (i){
                        case 1 -> "Bob";
                        case 2 -> "John";
                        case 3 -> "Mike";
                        case 4 -> "Richard";
                        case 5 -> "Jane";
                        default -> "Anonymous";
                    },
                    "07-01-1980",
                    "Nixware");

            System.out.println(employee );
        }
    }
}
