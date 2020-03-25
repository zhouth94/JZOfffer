package 剑指Offfer;

import java.util.Scanner;

public class 数值的整数次方 {
	public double Power(double base, int exponent){
		if(base == 0.0)
			return 0.0;
		int e = exponent>0 ? exponent:-exponent;
		double res = 1.0d;
		for (int i = 1; i <= e; i++) {
			res = res*base;
		}
		
		res = exponent>0 ? res:(1./res);
		return res;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个浮点数:");
		double base = sc.nextDouble();
		System.out.print("请输入一个整数:");
		int n = sc.nextInt();
		数值的整数次方 s = new 数值的整数次方();
		double res = s.Power(base, n);
		System.out.println(res);

	}

}
