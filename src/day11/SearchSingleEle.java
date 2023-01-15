package day11;

public class SearchSingleEle {
	public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low< high){
            int mid = (low+high)/2;
            if(nums[mid] == nums[mid+1]){
                if(mid%2 == 0){
                    low = mid+1;
                }
                else high = mid-1;
            }
            else{
                if(mid%2==0) high = mid;
                else low = mid+1;
            }
        }
        return nums[low];
    }
	public static void main(String[] args) {
		
	}

}
