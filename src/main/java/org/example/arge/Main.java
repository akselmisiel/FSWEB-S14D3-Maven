package org.example.arge;

public class Main {
    public static void main(String[] args) {
        CarSkeleton car1 = new GasPoweredCar("Gasoline Car", "A car that runs on gasoline", 10, 4);
        CarSkeleton car2 = new ElectricCar("Electric Car", "A car that runs on electricity", 100, 1000);
        CarSkeleton car3 = new HybridCar("Hybrid Car", "A car that runs on gasoline and electricity", 20, 500, 4);

        car1.drive();
        car2.drive();
        car3.drive();

        car1.startEngine();
        car2.startEngine();
        car3.startEngine();


    }
}
