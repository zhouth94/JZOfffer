package 剑指Offfer;

import java.util.Scanner;

public class 斐波拉契数列 {
	public int Fibonacci(int n){
		if(n==1 || n==2)
			return 1;
		return Fibonacci(n-1) + Fibonacci(n-2); 
		
	}
	
	public int f(int n){
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数n:");
		int n = sc.nextInt();
		斐波拉契数列 f = new 斐波拉契数列();
		int res = f.Fibonacci(n);
		System.out.println(res);

	}

}
