import java.util.*;
public class StringtocharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        char[] ch = str.toCharArray();

        for(char character: ch){
            System.out.print(character+",");
        }
    }
}
