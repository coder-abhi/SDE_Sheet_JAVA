package day11;

public class SearchInRotatedArr {
	
	public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(target == nums[mid]) return mid;
            if(nums[low] <= nums[mid]){ // if left side is sorted
                if(target < nums[mid] && target >= nums[low]){ // target is between left and mid
                    high = mid-1;
                }
                else{ // target is between mid and right
                    low = mid+1;
                }
            }
            else{// left is not sorted -> means right side is sorted
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }
                else high = mid-1;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		
	}

}
