/*The first line contains an integer,T, denoting the number of test cases. Each test case,T, is comprised of a single line with an integer,n, which can be arbitrarily large or small.
*/

import java.util.*;



class Solution{
    public static void main(String args[])
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                short x=sc.nextShort();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if (x >= -32768 && x <= 32767) System.out.println("* short");
                if (x >= -2147483648 && x <= 2147483647) System.out.println("* int");
                if (x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
            sc.close();
        }
    }
}