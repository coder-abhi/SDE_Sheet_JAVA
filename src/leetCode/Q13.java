package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Q13 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		String input = "MCMXCIV";
		int ans = 0;
		int temp = 0;
		for(int i=0; i< input.length(); i++) {
			if(temp < map.get(input.charAt(i)) && temp!=0) {
				ans += (map.get(input.charAt(i)) - temp);
				temp = 0;
				continue;
			}
			ans += temp;
			temp = map.get(input.charAt(i));
			
		}
		ans += temp;
		System.out.println(ans);
	}

}
