
package advancedjavaapplication;


import java.util.*;

class Company {
    String name;
    String address;

    Company(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Vehicle {
    String vehicleNumber;
    String type;

    Vehicle(String vehicleNumber, String type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }
}

class Driver {
    String name;
    String licenseNumber;

    Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
}

class Product {
    String productName;
    int quantity;

    Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
}

class ShopDelivery {
    String shopName;
    String location;
    String status;

    ShopDelivery(String shopName, String location) {
        this.shopName = shopName;
        this.location = location;
        this.status = "Pending";
    }
}

public class TransportSystem {
    static Scanner sc = new Scanner(System.in);

    static Company company;
    static Vehicle vehicle;
    static Driver driver;
    static List<Product> products = new ArrayList<>();
    static List<ShopDelivery> deliveries = new ArrayList<>();

    static double totalKM = 0;
    static double ratePerKM = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Transport Delivery Management System =====");
            System.out.println("1. Add Company Details");
            System.out.println("2. Add Vehicle Details");
            System.out.println("3. Add Driver Details");
            System.out.println("4. Add Product Load Details");
            System.out.println("5. Add Shop Delivery Details");
            System.out.println("6. View All Trip Details");
            System.out.println("7. View Pending Deliveries");
            System.out.println("8. Mark Delivery as Completed");
            System.out.println("9. Calculate Trip Amount");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                addCompany(); 
                break;
                case 2: 
                addVehicle();
                break;
                case 3:
                addDriver(); 
                break;
                case 4: 
                addProduct(); 
                break;
                case 5: 
                addDelivery(); 
                break;
                case 6: 
                viewTripDetails();
                break;
                case 7: 
                viewPending(); 
                break;
                case 8: 
                markCompleted(); 
                break;
                case 9: 
                calculateAmount(); 
                break;
                case 10: 
                System.out.println("Exiting..."); 
                break;
                default:
                System.out.println("Invalid choice!");
            }
        } while (choice != 10);
    }

    static void addCompany() {
        System.out.print("Enter company name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        company = new Company(name, address);
    }

    static void addVehicle() {
        System.out.print("Enter vehicle number: ");
        String num = sc.nextLine();
        System.out.print("Enter vehicle type: ");
        String type = sc.nextLine();
        vehicle = new Vehicle(num, type);
    }

    static void addDriver() {
        System.out.print("Enter driver name: ");
        String name = sc.nextLine();
        System.out.print("Enter license number: ");
        String license = sc.nextLine();
        driver = new Driver(name, license);
    }

    static void addProduct() {
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();
        products.add(new Product(name, qty));
    }

    static void addDelivery() {
        System.out.print("Enter shop name: ");
        String shop = sc.nextLine();
        System.out.print("Enter location: ");
        String loc = sc.nextLine();
        deliveries.add(new ShopDelivery(shop, loc));
    }

    static void viewTripDetails() {
        System.out.println("\n--- Trip Details ---");

        if (company != null)
            System.out.println("Company: " + company.name);

        if (vehicle != null)
            System.out.println("Vehicle: " + vehicle.vehicleNumber);

        if (driver != null)
            System.out.println("Driver: " + driver.name);

        System.out.println("\nProducts:");
        for (Product p : products) {
            System.out.println(p.productName + " - " + p.quantity);
        }

        System.out.println("\nDeliveries:");
        for (ShopDelivery d : deliveries) {
            System.out.println(d.shopName + " (" + d.location + ") - " + d.status);
        }
    }

    static void viewPending() {
        System.out.println("\n--- Pending Deliveries ---");
        for (ShopDelivery d : deliveries) {
            if (d.status.equals("Pending")) {
                System.out.println(d.shopName + " - " + d.location);
            }
        }
    }

    static void markCompleted() {
        System.out.print("Enter shop name to mark completed: ");
        String name = sc.nextLine();

        for (ShopDelivery d : deliveries) {
            if (d.shopName.equalsIgnoreCase(name)) {
                d.status = "Completed";
                System.out.println("Marked as completed.");
                return;
            }
        }
        System.out.println("Shop not found!");
    }

    static void calculateAmount() {
        System.out.print("Enter total KM: ");
        totalKM = sc.nextDouble();
        System.out.print("Enter rate per KM: ");
        ratePerKM = sc.nextDouble();

        double totalAmount = totalKM * ratePerKM;
        System.out.println("Total Trip Amount: " + totalAmount);
    }
}
