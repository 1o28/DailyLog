// Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

// answer.length == nums.length.
// answer[i] = |leftSum[i] - rightSum[i]|.
// Where:

// leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
// rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
// Return the array answer.

class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int size = nums.length;
        int[] leftSum = new int[size];
        int[] rightSum = new int[size];

        leftSum[0] = 0;
        for(int i=1; i<size; i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        rightSum[size-1] = 0;
        for(int i=size-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        
        int ans[] = new int[size];

        for(int i=0; i<size; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}
