package day14;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

	public static int[] nextSmallerEle(int[] input) {
		int result[] =  new int[input.length];
		Stack<Integer> stack = new Stack<>();
		int i = input.length - 1;
		int ele;
		while(i >= 0) {
			if(!stack.isEmpty()) {
				ele = stack.peek();
				if(input[i] < ele) {
					stack.pop();
					continue;
				}
				else {
					result[i] = ele;
					stack.push(input[i]);
					i--;
				}
			}
			else {
				stack.push(input[i]);
				result[i] = -1;
				i--;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int input[] = new int[]{1,3,2};
		int output[] = nextSmallerEle(input);
		
		System.out.println(Arrays.toString( input));
		System.out.println(Arrays.toString( output));
	}
	

}
