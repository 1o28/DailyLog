//Problem Statement
// Emilia is playing with bitwise xor. She is given integers A and B between 0 and 255 (inclusive).
// Help her find a non-negative integer C such that A xor C = B => (A⊕C = B).
// It can be proved that there uniquely exists such C, and it will be between 0 and 255 (inclusive).

// Constraints
// 0 ≤ A, B ≤ 255
// All values in input are integers.

// Sample Input 1
// 3 6
// Sample Output 1
// 5

// Sample Input 2
// 10 12
// Sample Output 2
// 6

// MySolution

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int C=0; C<=255; C++){
            if((A^C) == B){
                System.out.print(C);
            }
        }
    }
}
