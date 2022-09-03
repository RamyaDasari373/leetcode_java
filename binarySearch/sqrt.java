class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        long start = 1;
        long end = x;
        while(start <= end){
            long mid = (start+end)/2;
            if(mid*mid <= (long) x){
                ans = (int) mid;
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return ans;
    }
}
