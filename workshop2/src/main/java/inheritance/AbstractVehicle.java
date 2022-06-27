package inheritance;

public abstract class AbstractVehicle {
    private final String name;
    private double speed;
    public abstract void move();
    public static String getName() {
        return name;
    }
    protected  AbstractVehicle(String name) {
        this.name = name;
    }
    public static double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return String.format("Abstractvehicle: {name: %s, speed: %f}", name, speed);
    }

    public abstract VehicleType getType();
}

enum VehicleType {
    Car,
    Plane,
    Boat
};


