public class VehicleManagement {
    public static void main(String[] args) {

        System.out.println("Vehicle Management System");
        System.out.println("-------------------------");

        // Creating Car object
        Car1 car1 = new Car1("Toyota", 2022, 5);

        // Creating Motorcycle object
        Motorcycle bike = new Motorcycle("Yamaha", 2020, "Sports");

        System.out.println("Car:");
        car1.displayInfo();

        System.out.println("\nBike:");
        bike.displayInfo();
    }
}