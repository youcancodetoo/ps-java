import java.util.HashMap;
import java.util.Map;

public class DsHashMap {

    /**
     * Problem Title: LC 1. Two Sum
     * Problem Link: <a href="https://leetcode.com/problems/two-sum/">LC 1. Two Sum</a>
     * --
     * Solution:
     * 1) Create a HashMap to track the pairs (e.g. <num, index of num in array>)
     * 2) Iterate through the array
     * 2.1) whenever we visit an index, first check whether there is any entry with key as (target - num) in the tracker HashMap
     * 2.2) If such entry exists, we return the pair of current index and value available in tracker at key (target - num)
     * 2.3) if no such entry, create an entry of <num, index of num in array>
     * 3) if not returned yet, means there is no such pair whose sum is equal to target
     * --
     * Similar Problem with different response expectation:
     * @see DsArray#twoSumNumbers(int[], int)
     *
     * @param nums array of numbers
     * @param target the target sum of two numbers
     * @return array of two indexes for numbers whose sum is equal to target
     */
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to track
        Map<Integer, Integer> tracker = new HashMap<>();
        // Iterate through the array
        for(int idx=0; idx < nums.length; idx++) {
            // Check whether the corresponding pair of this number already present in the tracker
            if(tracker.containsKey(target - nums[idx])) {
                return new int[]{tracker.get(target - nums[idx]), idx};
            }

            tracker.put(nums[idx], idx);
        }

        return new int[]{};
    }
}
