package com.company;

class CarPolymorphism {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public CarPolymorphism(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car start engine";
    }

    public String accelerate() {
        return "Car accelerate";
    }

    public String brake() {
        return "Car brake";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends CarPolymorphism {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi start engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi brake";
    }
}

class Holden extends CarPolymorphism {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden start engine";
    }

    @Override
    public String accelerate() {
        return "Holden accelerate";
    }

    @Override
    public String brake() {
        return "Holden brake";
    }
}

class Ford extends CarPolymorphism {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford start engine";
    }

    @Override
    public String accelerate() {
        return "Ford accelerate";
    }

    @Override
    public String brake() {
        return "Ford brake";
    }
}

public class Polymorphism {
}
