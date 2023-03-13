/*
// You are given a string S consisting of lowercase English characters. The length of S is between 1 and 3, inclusive. Print the string of length 6 that is a repetition of S.
// It can be shown that there uniquely exists such a string under the Constraints of this problem.
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(str.length() == 1){
            System.out.print(str.repeat(6));
        }else if(str.length() == 2){
            System.out.print(str.repeat(3));
        }else if(str.length() == 3){
            System.out.print(str.repeat(2));
        }
    }
}
