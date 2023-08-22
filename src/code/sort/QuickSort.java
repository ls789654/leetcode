package code.sort;

/**
 * @author LuSheng
 * @title: quickSort
 * @projectName leetcode
 * @description: TODO
 * @date 2023/5/1018:23
 */
public class QuickSort {

    public static void quickSort(int[] nums, int left, int right) {
        if (left > right) {
            return;
        }
        int l = left + 1;
        int r = right;
        while (l < r) {
            while (l < r && nums[r] >= nums[left]) {
                r--;
            }
            while (l < r && nums[l] <= nums[left]) {
                l++;
            }
            if (l == r) {
                int temp = nums[left];
                nums[left] = nums[r];
                nums[r] = temp;
            } else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        quickSort(nums, left, r - 1);
        quickSort(nums, l+1, right);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        quickSort(nums, 0 , nums.length-1);

        for(int num : nums){
            System.out.println(num);
        }
    }
}
