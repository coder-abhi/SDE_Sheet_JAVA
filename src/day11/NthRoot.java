package day11;

public class NthRoot {
	
    public static double power(double a, int b){
        double ans = 1.0;
        for(int i = 0; i < b; i++){
            ans *= a;
        }
        return ans;
    }
	public static double findNthRootOfM(int n, int m) {
        double low = 0;
        double high = m;
        while(high - low > 0.0000001){
            double mid = (low+high)/2;
            System.out.println("Mid : "+mid);
            if(power(mid,n) < m) low = mid;
            else high = mid;
        }
        return low;
	}

	public static void main(String[] args) {
		
		System.out.println(findNthRootOfM(3, 27));

	}

}
