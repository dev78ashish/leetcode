class Solution {
    public boolean isPerfectSquare(int num) {
        int low =0;
        int high = num;
        while(low<=high){
            int mid = low+(high-low)/2;
            long m = (long)mid*mid;
            if(m==num) return true;
            else if(m>num) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
}
