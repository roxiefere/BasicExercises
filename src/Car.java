public class Car {
    private int year;
    private String make;
    private int miles;
    private String model;

    public Car(int year, String make, int miles, String model) {
        this.year = year;
        this.make = make;
        this.miles = miles;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public int getMiles() {
        return miles;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "This Car is a " + year + " " + model + " made by "+ make + " with " + miles + " miles.";
    }
}
