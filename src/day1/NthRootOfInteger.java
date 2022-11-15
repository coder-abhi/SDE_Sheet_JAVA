package day1;

public class NthRootOfInteger {
	
	public static double raiseTo(double num,int pow) {
		double ans = 1;
		for(int i=0;i<pow;i++) {
			ans *= num;
		}
		return ans;
	}
	
	public static void getNthRoot(int n,int m) {
		double low = 1.00;
		double high = m;
		double diff = 0.0001;
		while(high-low > diff) {
			double mid = (high+low) / 2;
			if(raiseTo(mid,n) > m) {
				high = mid;
			} else {
				low = mid;
			}
		}
		
		System.out.println("Low : "+low+"\tHigh : "+high);
	}
	

	public static void main(String[] args) {
		
		System.out.println(raiseTo(3,3));
		getNthRoot(3,27);

	}

}
