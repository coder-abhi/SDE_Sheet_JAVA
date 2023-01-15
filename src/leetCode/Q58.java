package leetCode;

public class Q58 {
	
	public static int lengthOfLastWord(String s) {
        String ans = s.trim();
        String[] ansArr = ans.split(" ");
        String answer = ansArr[ansArr.length-1];
        return answer.length();
    }

	public static void main(String[] args) {
		
		System.out.println(lengthOfLastWord("Hello World"));

	}

}
