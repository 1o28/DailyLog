// Problem Statement
// Alexa has a drink that has A kilocalories of energy per 100 milliliters. How many kilocalories of energy does B milliliters of this drink have?

// Constraints
// 0 ≤ A, B ≤1000
// All values in input are integers.

// Sample Input 1
// 45 200
// Sample Output 1
// 90.00

// Sample Input 2
// 37 450
// Sample Output 2
// 166.50

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.printf("%.2f",((A * B) / 100));
    }
}
