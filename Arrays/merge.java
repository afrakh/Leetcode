import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int k = m + n - 1;

        while (pointer1 >= 0 && pointer2 >=0){
            if (nums1[pointer1] > nums2[pointer2]){
                nums1[k--] = nums1[pointer1--];
            } else{
                nums1[k--] = nums2[pointer2--];
            }
        }

        while (pointer2 >= 0){
            nums1[k--] = nums2[pointer2--];
        }
    }
}
