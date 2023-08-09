// MyCarApp.java
public class MyCarApp {
    public static void main(String[] args) {
        // Car - 1: Toyota Camary
        System.out.println("Trip - 1");
        BuildCar toyota = new BuildCar("Toyota Camary");
        // Display Status At Start
        System.out.println("Toyota Camary Status At Start:");
        toyota.displayTrip();
        // Add 50 Miles
        toyota.addMiles(50);
        // Add Speed
        toyota.hitGas(100);
        // Travel 50 Miles Now
        toyota.addMiles(50);
        // Add Fuel
        toyota.addFuel(12);
        // Travel 50 Miles Now
        toyota.addMiles(40);
        // Turn Left
        toyota.turnLeft(45);
        // Check Fuel And Miles
        toyota.checkFuel(); toyota.checkMiles();
        // Hit Break
        toyota.hitBreak(20);
        // Travel 75 Miles
        toyota.addMiles(80);
        // Turn Right
        toyota.turnRight(90);
        // Check Fuel And Miles
        toyota.checkFuel(); toyota.checkMiles();
        // Hit Break
        toyota.hitBreak(10);
        // Travel 80 Miles
        toyota.addMiles(80);
        // End Of Trip
        System.out.println("Toyota Camary Status At End:");
        toyota.displayTrip();


        // Car - 2: VW POLO
        System.out.println("\n\nTrip - 2");
        BuildCar polo = new BuildCar("VW Polo");
        // Display Status At Start
        System.out.println("VW Polo Status At Start:");
        polo.displayTrip();
        // Add Fuel
        polo.addFuel(20);
        // Hit Gas
        polo.hitGas(50);
        // Travel 100 Miles Now
        polo.addMiles(100);
        // Turn 180
        polo.turnLeft(180);
        // Check Fuel And Miles
        polo.checkFuel(); polo.checkMiles();
        // Increase Speed
        polo.hitGas(30);
        // Travel 80 Miles
        polo.addMiles(80);
        // Turn Right
        polo.turnRight(90);
        // Check Fuel And Miles
        polo.checkFuel(); polo.checkMiles();
        // Decrease Speed
        polo.hitBreak(40);
        // Travel 80 Miles
        polo.addMiles(80);
        // End Of Trip
        System.out.println("VW Polo Status At End:");
        polo.displayTrip();

        
    }
}
