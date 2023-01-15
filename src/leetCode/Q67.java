package leetCode;

public class Q67 {
    public static String addBinary(String a, String b) {
    	int indA = a.length()-1;
    	int indB = b.length()-1;
    	int extra = 0;
    	int tempSum = 0;
    	String ans = "";
    	while(indA>=0 || indB>=0) {
    		if(extra == 1) tempSum += (extra--);
    		
    		if(indA >= 0 && a.charAt(indA)=='1') tempSum++;
    		if(indB >= 0 && b.charAt(indB)=='1') tempSum++;
    		if(tempSum >= 2) {
    			extra++;
    			tempSum = tempSum-2;
    		}
    		ans = tempSum + ans;
    		tempSum = 0;
    		indA--;
    		indB--;
    		
    		
    	}
    	if(extra == 1) ans = extra + ans;
    	return ans;
    }

	public static void main(String[] args) {
		System.out.println(addBinary("1111", "1111"));
	}

}
