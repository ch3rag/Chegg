import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static Random rand = new Random();

    // Converts Inches To MM
    public static double inchesToMM(double inches) {
        return inches * 25.4;
    }
    
    // Returns Average Rainfall In Last 3 Years
    public static double last3YearInInches(ArrayList<Double> data) {
        // Get Size Of ArrayList
        int n = data.size();
        if (n < 3) {
            return 100;
        }
        // Return Average Of Last 3 Items
        return (data.get(n - 1) - data.get(n - 2) + data.get(n - 3)) / 3;
    }

    // Fire Method
    public static void fire(Tree tree, ArrayList<Double> data) {
        double rainfall = last3YearInInches(data);
        if (rainfall < 0.5) {
            System.out.println("Oh no we had a fire!");
            tree.setMyChar('|');
        } else {
            tree.setMyChar('V');
        }
    }

    // Inches Rain Method
    // Return Inches Of Rainfall Fell This Year
    // Inches Of Rainfall Is A Random Number In Range [0.0, 2.0)
    public static double inchesRain(ArrayList <Double> data) {
        // Pick A Random Number
        double randomNum = rand.nextDouble() * 2;
        // Add The Random To Array List
        data.add(randomNum);
        // Return The Random Number
        return randomNum; 
    }



    // Main
    public static void main(String[] args) {
        // Create A New Tree With Height = 0
        Tree tree = new Tree(0);
        // Array List To Hold Data Of RainFall
        ArrayList <Double> inchesRainfallList = new ArrayList <Double>();
        // Loop From Year = 1 To 20
        for (int year = 1; year <= 20; year++) {
            // Print The Current Year
            System.out.printf("Year: %d\n", year);
            // Call InchesRain To Get The Amount Of Rain That Fell This Year In Inches
            double inchesRainfall = inchesRain(inchesRainfallList);
            // Convert Inches To MM
            double mmRainfall = inchesToMM(inchesRainfall);
            // Print Amount Of Rainfall
            System.out.printf("Rain this year: %f inches or %f mm\n",
                inchesRainfall, mmRainfall);
            // Call Grow
            tree.grow(mmRainfall);
            // Call DrawMe
            tree.drawMe();
            // Check If Tree On Fire
            fire(tree, inchesRainfallList);
        }
    }
}
