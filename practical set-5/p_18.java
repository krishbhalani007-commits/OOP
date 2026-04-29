import java.util.Scanner;

abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuel;

    Car(String f) {
        fuel = f;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuel;

    Bike(String f) {
        fuel = f;
    }

    String fuelType() {
        return fuel;
    }

    int noOfWheels() {
        return 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fuel type for car (Petrol/Diesel): ");
        String carFuel = sc.nextLine();

        System.out.print("Enter fuel type for bike: ");
        String bikeFuel = sc.nextLine();

        Car c = new Car(carFuel);
        Bike b = new Bike(bikeFuel);

        System.out.println("Car Fuel: " + c.fuelType());
        System.out.println("Car Wheels: " + c.noOfWheels());

        System.out.println("Bike Fuel: " + b.fuelType());
        System.out.println("Bike Wheels: " + b.noOfWheels());
    }
}