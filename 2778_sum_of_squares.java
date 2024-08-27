class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0; i<n ;i++){
            int a = i+1;
            if(n%a==0){
                int sq = nums[i]*nums[i];
                sum+=sq;
            }
        }
        return sum;
    }
}
