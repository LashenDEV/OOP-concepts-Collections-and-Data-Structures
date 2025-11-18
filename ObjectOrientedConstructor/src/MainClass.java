public class MainClass {
    public static void main(String[] args) {
        Library library = new Library("Galle Library", 20000, "No 1, Galle Road, Galle.");

        System.out.println(library.getName());
        System.out.println(library.getNumBooks());
        System.out.println(library.getAddress());

        library.setName("Second Library");
        library.setNumBooks(3000);
        library.setAddress("Matara Road, Galle.");

        System.out.println(library.getName());
        System.out.println(library.getNumBooks());
        System.out.println(library.getAddress());
    }
}
