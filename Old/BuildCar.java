// BuildCar.java

// Blue Print Of The Car Object
public class BuildCar {
    // Instance Variables
    private int speed;
    private int odometer;
    private int direction;
    private int fuelGauge;
    // Name Of The Car
    private String name;
    // Number Of Legs
    int numLegs;

    // Default Constructor
    public BuildCar(String carName) {
        // All Values Start At 0
        speed = 0;
        odometer = 0;
        direction = 0;
        fuelGauge = 0;
        numLegs = 0;
        // Assign The Name
        name = carName;
    }

    // Accelerate Car
    public void hitGas(int newSpeed) {
        speed += newSpeed;
        // Print Message
        System.out.println("Speed Of " + name + " Increased By " + newSpeed + " MPH.");
    }

    // Deaccelerate Car
    public void hitBreak(int amount) {
        if (speed == 0) {
            System.out.println(name + " is Already Stopped.");
        } else {
            if (amount > speed) {
                speed = 0;
            } else {
                speed -= amount;
            }
            System.out.println("Speed Of " + name + " Decreased By " + amount + " MPH.");
        }
    }

    // Turn Left By Degrees
    public void turnLeft(int degrees) {
        direction -= degrees;
        numLegs++;
        System.out.println(name + " Just Turned Left By " + degrees + " Degrees.");
    }

    // Turn Right By Degrees
    public void turnRight(int degrees) {
        direction += degrees;
        numLegs++;
        System.out.println(name + " Just Turned Right By " + degrees + " Degrees.");
    }

    // Add Miles To Trip
    public void addMiles(int numMiles) {
        if (speed > 0) {
            // Check If The Car Has Enough Fuel
            int fuelNeeded = numMiles / 20;
            if (fuelGauge >= fuelNeeded) {
                System.out.println(name + " Just Added " + numMiles + " More Miles To The Trip.");
                // Decrease The Fuel
                fuelGauge -= fuelNeeded;
                odometer += numMiles;
            } else {
                // Not Enough Fuel
                // Show Amount Of The Fuel Needed
                System.out.println((fuelNeeded - fuelGauge) + " Gallons Of More Fuel is Required To Travel " + numMiles + " Miles.");
            }
        } else {
            System.out.println(name + " is Stopped. Please Hit Gas!");
        }
    }

    // Add Fuel
    public void addFuel(int gallons) {
        fuelGauge += gallons;
        System.out.println("Just Added " + gallons + " Gallons Of Fuel in " + name + ".");
    }

    // Check Fuel
    public void checkFuel() {
        System.out.println(name + " Has " + fuelGauge + " Gallons Of Fuel.");
    }

    // Check The Number Of Miles Clocked
    public void checkMiles() {
        System.out.println(name + " Has Travelled " + odometer + " Miles So Far.");
    }

    // Diplay Trip Information
    public void displayTrip() {
        System.out.println(name + " Has Travelled " + odometer + " Miles And Consumed "
            + (odometer / 20) + " Gallons Of Fuel. The Current Speed is " + speed + " MPH."
            + "The Amount Of Fuel Left is " + fuelGauge + " Gallons. We Are Travelling in "
            + direction + " Degrees Direction. We Have Clocked " + numLegs + " Legs So Far.");
    }
}