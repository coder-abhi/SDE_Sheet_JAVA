package leetCode;

import java.util.Arrays;

public class Q14 {
	/*
	Brute Force
	public static String LongestPrefix(String[] input) {
		String ans ="";
		
		char temp = '.';
		for(int i=0;i< input[0].length() ; i++) {
			temp = input[0].charAt(i);
			for(String str : input) {
				if(i < str.length()) {
					if(temp != str.charAt(i)) return ans;
				}
				else return ans;
				
			}
			ans += temp;
		}
		
		return ans;
	}
*/
	public static String LongestPrefix(String[] input) {
		String ans = "";
		Arrays.sort(input);
		
		for(int i=0; i< input[0].length() ; i++) {
			if(input[0].charAt(i) != input[input.length-1].charAt(i)) return ans;
			else ans += input[0].charAt(i);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] input = new String[] {"flower","flow","flight"};
		
		String[] input = new String[] {"cluster","clue","club"};
		
		System.out.println(LongestPrefix(input));
		
	}

}
