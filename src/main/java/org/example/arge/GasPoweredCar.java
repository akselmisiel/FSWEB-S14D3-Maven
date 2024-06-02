package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double AverageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double AverageKmPerLiter, int cylinders) {
        super(name, description);
        this.AverageKmPerLiter = AverageKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return AverageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("The gas-powered engine of " + getClass().getSimpleName() + " is starting.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving on gasoline.");
        runEngine();
    }
}
