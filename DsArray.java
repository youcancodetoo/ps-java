import java.util.Arrays;

public class DsArray {

    /**
     * Problem Title: LC 1. Two Sum (modified) (expected response: pair of numbers instead of indexes)
     * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a> (with different response expectation)
     * --
     * Solution:
     * 1) Sort the input array i.e. nums
     * 2) Use 2-pointer approach
     * 3) Variable (Pointer) 1 will start from index 0 in forward direction and Variable (Pointer) 2 will start from last index (i.e. length of atrray - 1) in backward direction
     * 4) if sum of values at Pointer1 and Pointer2 is equal to target, we got the pair to return
     * 5) if not, then check which pointer to move
     *
     * @param nums array of numbers
     * @param target the target sum of two numbers
     * @return array of two numbers whose sum is equal to target
     * --
     * Time complexity: O(n log(n)), contributed by sorting step
     * Space complexity: O(1)
     */
    public int[] twoSumNumbers(int[] nums, int target) {
        // This is an inplace sort, so no need to assign it to a variable
        Arrays.sort(nums);

        int pt1 = 0;
        int pt2 = nums.length - 1;
        while(pt1 < pt2) {
            if(nums[pt1] + nums[pt2] == target) {
                return new int[]{nums[pt1], nums[pt2]};
            }

            if(nums[pt1] + nums[pt2] > target) {
                // trying to reduce the sum
                pt2--;
            } else {
                // trying to increase the sum
                pt1++;
            }
        }

        return new int[]{};
    }
}
