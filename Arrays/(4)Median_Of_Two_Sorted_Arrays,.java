Hard level
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
  
  
solution:
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = nums1.length;
        int m = nums2.length;
        int new_arr[] = new int[m+n];
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                new_arr[k] = nums1[i];
                i++;
                k++;
            }
            else{
                new_arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            new_arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<m){
            new_arr[k] = nums2[j];
            j++;
            k++;
        }
        int mid;
        double ans;
        if(new_arr.length % 2 != 0){
            mid = new_arr.length/2;
            ans = new_arr[mid];
        }
        else{
            mid = new_arr.length/2;
            double num1 = new_arr[mid];
            double num2 = new_arr[mid-1];
            ans = (num1+num2)/2;
        }
        return ans;
        
	    
    }
}
