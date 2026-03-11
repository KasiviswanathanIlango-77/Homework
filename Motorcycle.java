class Motorcycle extends Vehicle {
    String type;

    // Constructor
    Motorcycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}