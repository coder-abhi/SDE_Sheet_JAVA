package day7;

import java.util.Arrays;

public class RemoveDuplicate {
	
	public static void removeDuplicate(int[] arr) {
		int current = 0;
		int fast = 0;
		while(fast < arr.length) {
			if(arr[current] != arr[fast]) arr[++current] = arr[fast];
			fast++;
		}
		current++;
		while(current < arr.length) arr[current++] = -1;
	}

	public static void main(String[] args) {
		int input[] = new int[] {1,1,1,2,2,3,3,3,3,4,4};
		removeDuplicate(input);
		System.out.println(Arrays.toString(input));
	}

}
