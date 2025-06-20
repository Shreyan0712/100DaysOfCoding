public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        search(nums,9);
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = low + (high - low)/2;

        while(low != high) {
            if(target > nums[mid]){
                low = mid + 1;
                mid = low + (high - low)/2;
            } else if (target < nums[mid]){
                high = mid - 1;
                mid = low + (high - low)/2;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
