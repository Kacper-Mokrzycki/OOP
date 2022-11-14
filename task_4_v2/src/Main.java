import java.util.concurrent.TimeUnit;

interface Vechicle_functions {
    public void start_engine();
    public void turn_off_engine();
    public void drive_faster();
    public void drive_slower();
}

class Engine{
    private int volume;
    private int horse_power;
    private int torque;

    public Engine(int volume, int horse_power, int torque) {
        this.volume = volume;
        this.horse_power = horse_power;
        this.torque = torque;
    }

}


class Vehicle implements Vechicle_functions{
    public float gas_pedal_status = 0;
    public boolean engine_status = false;
    @Override
    public void start_engine() {
        this.engine_status = true;
        this.gas_pedal_status = (float) 0.1;
    }

    @Override
    public void turn_off_engine() {
        this.engine_status = false;
        this.gas_pedal_status = 0;

    }

    @Override
    public void drive_faster() {
        if (this.gas_pedal_status <=0.9) {
            this.gas_pedal_status = this.gas_pedal_status + (float) 0.1;
        }
    }

    @Override
    public void drive_slower() {
        if (this.gas_pedal_status >=0.1) {
            this.gas_pedal_status = this.gas_pedal_status - (float) 0.1;
        }
    }

    private Brand brand;
    private Engine engine;
    private int max_speed;

    public Vehicle Change_engine(Engine newEngine){ // Here is the Immutability implementation
        return new Vehicle(brand,newEngine,max_speed);
    }
    public Vehicle(Brand brand, Engine engine, int max_speed) {
        this.brand = brand;
        this.engine = engine;
        this.max_speed = max_speed;
    }
    public String vehicle_speed(){
        return String.format("%d", max_speed);
    }
}


class Brand{
    private String brand_name;
    private int start_year;
    private int number_of_employees;
    private String capitalization;
    private String debt;

    public Brand(String brand_name, int start_year, int number_of_employees, String capitalization, String debt) {
        this.brand_name = brand_name;
        this.start_year = start_year;
        this.number_of_employees = number_of_employees;
        this.capitalization = capitalization;
        this.debt = debt;
    }
}


public class Main {
    public static void main(String[] args) {
        Brand brand = new Brand("BMW", 1916, 118000, "53000000000", "15000000000");
        Engine engine = new Engine(2000,250,500);
        Vehicle vehicle = new Vehicle(brand, engine, 250);
        System.out.println(vehicle.vehicle_speed());
    }
}