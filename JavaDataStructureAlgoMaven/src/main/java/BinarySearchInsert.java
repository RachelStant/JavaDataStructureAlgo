//Given a sorted array of distinct integers and a target value, return the index if the target is found.
//        If not, return the index where it would be if it were inserted in order.

public class BinarySearchInsert {

    public static void main(String[] args) {

        int[] numsArray = new int[] {1,3,5,6};
        int result = searchInsert(numsArray, 5);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid -1;
            else start = mid + 1;
        }
        return start;
    }
}
