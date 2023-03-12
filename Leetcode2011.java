// There is a programming language with only four operations and one variable X:

// ++X and X++ increments the value of the variable X by 1.
// --X and X-- decrements the value of the variable X by 1.
// Initially, the value of X is 0.

// Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int X = 0;

        for(int i=0; i<n; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                X++;
            }else{
                X--;
            }
        }

        return X;
    }
}
