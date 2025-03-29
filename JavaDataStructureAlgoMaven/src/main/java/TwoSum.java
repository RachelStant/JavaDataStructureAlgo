//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.


import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums =  {2,7,11,15};
        int[] result = twoSum(nums, 9);
        System.out.println(result.toString());
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] {prevMap.get(diff), i};
            }
            prevMap.put(num, i);
        }
        return new int[]{};
    }
}
