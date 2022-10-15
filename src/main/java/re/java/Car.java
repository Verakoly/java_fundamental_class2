package re.java;

public class Car {

    //define fields

    int carId;
    String model;
    String color;
    String gearBox;
    String brand;

    // methods

    public String getCarDetails() {
        return "Vehicle is a " + color + " " + brand + " " + model + " with " + gearBox +
                " gear" + ". " + "Car ID = " + carId;
    }

}
