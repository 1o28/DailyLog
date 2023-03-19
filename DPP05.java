// Problem Statement
// Alexa found two positive integers, a and b. Determine whether the concatenation of a and b in this order is a square number.

// Constraints
// 1 ≤ a, b ≤ 100
// a and b are integers.

// Sample Input 1
// 1 44
// Sample Output 1
// Yes

// Sample Input 2
// 100 100
// Sample Output 2
// No

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = (a +"") + (b + "");
        a = Integer.parseInt(str);
        b = (int)Math.sqrt(a);

        if(b*b == a)
            System.out.print("Yes");
        else
            System.out.print("No");
    }   
}
