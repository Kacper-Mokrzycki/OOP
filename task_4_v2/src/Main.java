import java.util.concurrent.TimeUnit;

interface Vehicle {
    public void startEngine();
    public void turnOffEngine();
    public void driveFaster();
    public void driveSlower();
}

class Engine{
    private int volume;
    private int horsePower;
    private int torque;

    public Engine(int volume, int horsePower, int torque) {
        this.volume = volume;
        this.horsePower = horsePower;
        this.torque = torque;
    }

}


class Car implements Vehicle{
    public float gasPedalStatus = 0;
    public boolean engineStatus = false;
    @Override
    public void startEngine() {
        this.engineStatus = true;
        this.gasPedalStatus = (float) 0.1;
    }

    @Override
    public void turnOffEngine() {
        this.engineStatus = false;
        this.gasPedalStatus = 0;

    }

    @Override
    public void driveFaster() {
        if (this.gasPedalStatus <=0.9) {
            this.gasPedalStatus = this.gasPedalStatus + (float) 0.1;
        }
    }

    @Override
    public void driveSlower() {
        if (this.gasPedalStatus >=0.1) {
            this.gasPedalStatus = this.gasPedalStatus - (float) 0.1;
        }
    }

    private Brand brand;
    private Engine engine;
    private int maxSpeed;

    public Car changeEngine(Engine newEngine){ // Here is the Immutability implementation
        return new Car(brand,newEngine,maxSpeed);
    }
    public Car(Brand brand, Engine engine, int maxSpeed) {
        this.brand = brand;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }
    public String vehicleSpeed(){
        return String.format("%d", maxSpeed);
    }
}


class Brand{
    private String brandName;
    private int startYear;
    private int numberOfEmployees;
    private String capitalization;
    private String debt;

    public Brand(String brandName, int startYear, int numberOfEmployees, String capitalization, String debt) {
        this.brandName = brandName;
        this.startYear = startYear;
        this.numberOfEmployees = numberOfEmployees;
        this.capitalization = capitalization;
        this.debt = debt;
    }
}


public class Main {
    public static void main(String[] args) {
        Brand brand = new Brand("BMW", 1916, 118000, "53000000000", "15000000000");
        Engine engine = new Engine(2000,250,500);
        Car vehicle = new Car(brand, engine, 250);
        System.out.println(vehicle.vehicleSpeed());
    }
}