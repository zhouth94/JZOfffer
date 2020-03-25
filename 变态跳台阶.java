package ½£Ö¸Offfer;

public class ±äÌ¬ÌøÌ¨½× {
	/*
	 * f(n)=f(n-1)+f(n-2)+...+f(1)
	 * f(n-1)=f(n-2)+f(n-3)+...+f(1)
	 * f(n)=2*f(n-1)
	 * f(n)/f(n-1)=2
	 * an=a1*q^n	a1=f(1)=1
	 */
	public int jumpFloorII(int target){
		return (int)Math.pow(2, target-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
