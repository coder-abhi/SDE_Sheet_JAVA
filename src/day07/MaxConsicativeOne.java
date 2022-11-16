package day07;

public class MaxConsicativeOne {
	public static int maxConsicativeOne(int[] arr) {
		int answer = 0;
		int tempMaxOneCount = 0;
		for(int ele : arr) {
			if(ele != 1) tempMaxOneCount = 0;
			else tempMaxOneCount++;
			if(answer < tempMaxOneCount) answer = tempMaxOneCount;
		}
		return answer;
		
	}

	public static void main(String[] args) {
		
		int input[] = new int[]{0,1,1,1,1,0,1,1,1};
		System.out.println(maxConsicativeOne(input));
	}

}
