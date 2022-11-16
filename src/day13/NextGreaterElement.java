package day13;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static int[] nextGreaterEle(int[] input) {
		int result[] =  new int[input.length];
		Stack<Integer> stack = new Stack<>();
		int i = input.length - 1;
		int ele;
		while(i >= 0) {
			if(!stack.isEmpty()) {
				ele = stack.peek();
				if(input[i] >= ele) {
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
		i = input.length-1;
		while(!stack.isEmpty()) {
			ele = stack.peek();
			if(input[i] >= ele) {
				stack.pop();
			}
			else {
				result[i] = ele;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int input[] = new int[]{3,10,4,2,1,2,6,1,7,2,9};
		int output[] = nextGreaterEle(input);
		
		System.out.println(Arrays.toString( input));
		System.out.println(Arrays.toString( output));
	}
	

}
