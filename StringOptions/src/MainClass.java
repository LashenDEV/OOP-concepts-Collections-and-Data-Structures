public class MainClass {
    public static void main(String[] args) {
        String message = "I love" + " programming";
        StringBuilder messageBuilder = new
                StringBuilder("I love " + "programming");

        message.concat(" in Java");
        messageBuilder.append(" in Java");
        printInfo(message);
        printInfo(messageBuilder);
    }

    public static void printInfo(String myString){
        System.out.println("String = " + myString);
        System.out.println("Length = " + myString.length());
    }

    public static void printInfo(StringBuilder myBuilder){
        System.out.println("StringBuilder = " + myBuilder);
        System.out.println("Length = " + myBuilder.length());
    }
}
