package ��ָOfffer;

import java.util.Scanner;

public class ��ֵ�������η� {
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
		System.out.print("������һ��������:");
		double base = sc.nextDouble();
		System.out.print("������һ������:");
		int n = sc.nextInt();
		��ֵ�������η� s = new ��ֵ�������η�();
		double res = s.Power(base, n);
		System.out.println(res);

	}

}
