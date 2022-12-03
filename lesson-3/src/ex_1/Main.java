package ex_1;

class Main {
    public static void main(String[] args) {
        Brand brand = new Brand("BMW", 1916, 118000, "53000000000", "15000000000");
        Engine engine = new Engine(2000,250,500);
        Condition condition = new Condition(15, Usage.taces_of_use, 150000);
        Vehicle vehicle = new Vehicle(brand, condition, engine, 250);
        System.out.println(vehicle.vehicle_spped());
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


    enum Usage{
        factory_new, taces_of_use, junker
    }

    class Condition{
        private int age;
        private Usage usage;
        private int mileage;

        public Condition(int age, Usage usage, int mileage) {
            this.age = age;
            this.usage = usage;
            this.mileage = mileage;
        }
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

    class Vehicle{
        private Brand brand;
        private Condition condition;
        private Engine engine;
        private int max_speed;

        public Vehicle(Brand brand, Condition condition, Engine engine, int max_speed) {
            this.brand = brand;
            this.condition = condition;
            this.engine = engine;
            this.max_speed = max_speed;
        }
        public String vehicle_spped(){
            return String.format("%d", max_speed);
        }
    }


