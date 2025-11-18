public class Pen {
    private String manufacturer;
    private String color;
    private String type;

    public void describePen() {
        System.out.println("Manufacturer: " + this.manufacturer + " Color: " + this.color + " Type: " + this.type);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        if(manufacturer == null) manufacturer = "Unknown";
        String lowercaseManufacturer = manufacturer.toLowerCase();
        switch(lowercaseManufacturer) {
            case "franklin", "schon", "noodler" -> this.manufacturer = manufacturer;
            default -> {
                this.manufacturer = "Unsupported";
            }
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
