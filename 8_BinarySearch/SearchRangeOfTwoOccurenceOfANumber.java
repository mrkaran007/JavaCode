//Q.> Find First and Last Position of Element in Sorted Array 

/**
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value. The targer value
 * maximum occur two times only.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * 
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */
public class SearchRangeOfTwoOccurenceOfANumber {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        if(end == 0){
            if(nums[0] == target){
                ans[0] = 0;
                ans[1] = 0;
            }
            return ans;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                if(mid + 1 <= nums.length - 1 && nums[mid + 1] == target){
                    ans[0] = mid;
                    ans[1] = mid + 1;
                }else if(mid - 1 >= 0 && nums[mid - 1] == target ){
                    ans[0] = mid - 1;
                    ans[1] = mid;
                }
                else{
                    ans[0] = mid;
                    ans[1] = mid;
                }
                return ans;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
