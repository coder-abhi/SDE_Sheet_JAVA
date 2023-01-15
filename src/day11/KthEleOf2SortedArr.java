package day11;

public class KthEleOf2SortedArr {
    public static int findMid(int[] nums1, int[] nums2 , int K) {
    	
        int reqInd = K;
        int flag = 0;

        int ptr1=0,ptr2=0;
        int currEle = -1;

        for(int i=0;i< reqInd; i++){
            if(ptr1 >= nums1.length){
                currEle = nums2[ptr2++];
                continue;
            }
            if(ptr2 >= nums2.length){
                currEle = nums1[ptr1++];
                continue;
            }
            if(nums1[ptr1] < nums2[ptr2])currEle = nums1[ptr1++];
            else currEle = nums2[ptr2++];
        }
        return currEle;
    }

	public static void main(String[] args) {
		
		int arr1[] = new int[]{0};
		int arr2[] = new int[]{1,4,8,10};
		
		System.out.println(findMid(arr1,arr2,2));

	}

}
