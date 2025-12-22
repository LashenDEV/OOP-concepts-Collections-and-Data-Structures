public class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public void isRipe(String check){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(name + " is a " + instanceType + " and " + check);
    }

    public static Fruit getFruit(String type, String name) {
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Apple(name);
            case 'B' -> new Banana(name);
            default -> new Fruit(name);
        };
    }
}

class Apple extends Fruit {
    public Apple(String name) {
        super(name);
    }

    @Override
    public void isRipe(String check) {
        super.isRipe(check);
        System.out.println(check + " Apple may lower your risk for cancer, " +
                "diabetes, and heart disease.");
    }
}

class Banana extends Fruit {
    public Banana(String name) {
        super(name);
    }

    @Override
    public void isRipe(String check) {
        super.isRipe(check);
        System.out.println(check + " Banana may support. " +
                "digestive health");
    }
}
