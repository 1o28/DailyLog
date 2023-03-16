// Problem Statement
// Alexa is meeting up with Bob. They have planned to meet at a place that is D meters away from Alexa's house in T minutes from now. Alexa will leave her house now and go straight to the place at a speed of
// S meters per minute. Will she arrive in time?

// Constraints
// 1 ≤ D ≤ 10000
// 1 ≤ T ≤ 10000
// 1 ≤ S ≤ 10000
// All values in input are integers.

// Sample Input 1
// 1000 15 80
// Sample Output 1
// Yes

// Sample Input 2
// 2000 20 100
// Sample Output 2
// Yes

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt();
        int time = sc.nextInt();
        int speed = sc.nextInt();
        System.out.println((time*speed >= dist) ? "Yes" : "No");
    }
}
