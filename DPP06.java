// You drew lottery N times. In the i- th draw, you got an item of the kind represented by a string Si. How many kinds of items did you get?

// Constraints
// 1 ≤ N ≤ 2×10^5
// Si consists of lowercase English letters and has a length between 1 and 10 (inclusive).

// Sample Input 1
// 3
// apple
// orange
// apple
// Sample Output 1
// 2
  
// Sample Input 1
// 3
// apple
// orange
// grape
// Sample Output 1
// 3


// My Solution ----- Using Hashing -----

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(str[i]);
        }

        System.out.print(set.size());
    }
}
