class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        int i=0, j=0, k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }
        } 
        while(i < nums1.length){
            arr[k++] = nums1[i++];
        }  
        while(j < nums2.length){
            arr[k++] = nums2[j++];
        }  
        double median = 0.0;
        if(n % 2 == 0){
            int mid1 = arr[(n/2)-1];
            int mid2 = arr[n/2];
            median = (mid1 + mid2) / 2.0;
        }   
        else{
            median = arr[n/2];
        }  
        return median;      
    }
}