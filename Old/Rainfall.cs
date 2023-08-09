using System.Collections.Generic;
using System;

public class Program {

    public static Random rand = new Random();

    // Converts Inches To MM
    public static double inchesToMM(double inches) {
        return inches * 25.4;
    }
    
    // Returns Average Rainfall In Last 3 Years
    public static double last3YearInInches(List<double> data) {
        // Get Size Of ArrayList
        int n = data.Count;
        if (n < 3) {
            return 100;
        }
        // Return Average Of Last 3 Items
        return (data[n - 1] - data[n - 2] + data[n - 3]) / 3;
    }

    // Fire Method
    public static void fire(Tree tree, List<double> data) {
        double rainfall = last3YearInInches(data);
        if (rainfall < 0.5) {
            Console.WriteLine("Oh no we had a fire!");
            tree.setMyChar('|');
        } else {
            tree.setMyChar('V');
        }
    }

    // Inches Rain Method
    // Return Inches Of Rainfall Fell This Year
    // Inches Of Rainfall Is A Random Number In Range [0.0, 2.0)
    public static double inchesRain(List<double> data) {
        // Pick A Random Number
        double randomNum = rand.NextDouble() * 2;
        // Add The Random To Array List
        data.Add(randomNum);
        // Return The Random Number
        return randomNum; 
    }



    // Main
    static void Main(String[] args) {
        // Create A New Tree With Height = 0
        Tree tree = new Tree(0);
        // Array List To Hold Data Of RainFall
        List<double> inchesRainfallList = new List<double>();
        // Loop From Year = 1 To 20
        for (int year = 1; year <= 20; year++) {
            // Print The Current Year
            Console.WriteLine($"Year: {year}\n");
            // Call InchesRain To Get The Amount Of Rain That Fell This Year In Inches
            double inchesRainfall = inchesRain(inchesRainfallList);
            // Convert Inches To MM
            double mmRainfall = inchesToMM(inchesRainfall);
            // Print Amount Of Rainfall
            Console.WriteLine($"Rain this year: {inchesRainfall} inches or {mmRainfall} mm");
            // Call Grow
            tree.grow(mmRainfall);
            // Call DrawMe
            tree.drawMe();
            // Check If Tree On Fire
            fire(tree, inchesRainfallList);
        }
    }
}
