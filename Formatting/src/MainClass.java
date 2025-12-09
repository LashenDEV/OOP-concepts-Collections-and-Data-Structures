public class MainClass {
    public static void main(String[] args) {
        String RightArrow = "Welcome to our: \n" +
                "\t\u279E Company\n" +
                "\t\t\u279E Nixware";
        System.out.println(RightArrow);

        String textBlock = """
                Welcome to our:
                    \u279E Company
                            \u279E Nixware
                """;

        System.out.println(textBlock);

        int number = 100;
        System.out.printf("Your Number is: %d\n", number);

        int sum = number + 50;
        System.out.printf("Sum is: %d\n", sum);
    }
}
