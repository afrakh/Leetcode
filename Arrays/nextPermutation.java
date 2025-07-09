class Solution {
    public void reverse(int[] nums, int left, int right){
        while (left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // find the pivot
        for (int i = n - 2; i >= 0; i--){
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // if the array is in decreasing order then reverse the array
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // find the rightmost element greater than pivot
        for (int i = n - 1; i > pivot; i--){
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // reverse from (pivot + 1) to n - 1
        reverse(nums, pivot + 1, n - 1);
    }
}
