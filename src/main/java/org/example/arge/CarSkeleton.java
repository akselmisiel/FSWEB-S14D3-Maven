package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }

    public void startEngine() {
        System.out.println("The engine of " + getClass().getSimpleName() + " is starting.");
    }

    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving.");
        runEngine();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    protected void runEngine() {
        System.out.println("The engine is running.");
    }
}
