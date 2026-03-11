class Car1 extends Vehicle {
    int seats;

    // Constructor
    Car1(String brand, int year, int seats) {
        super(brand, year); // calling base class constructor
        this.seats = seats;
    }

    // Overriding displayInfo()
    // @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats);
    }
}