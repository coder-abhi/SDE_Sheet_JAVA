package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		int n= 5;
		List<Integer> currRow,LastRow;
		LastRow = new ArrayList<>();
		for(int i=0 ; i< 5; i++) {
			
			currRow = new ArrayList<Integer>();
			
			for(int j=0; j<=i; j++) {
				if(j==0 || j== i) currRow.add(1);
				else {
					currRow.add(LastRow.get(j-1)+LastRow.get(j));					
				}
			}
			LastRow = currRow;
			result.add(currRow);
		}
		
		for(List<Integer> i : result) {
			System.out.println(i.toString());
		}
//	System.out.println(Arrays.deepToString(result));
	}

}
