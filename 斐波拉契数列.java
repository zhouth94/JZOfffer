package ��ָOfffer;

import java.util.Scanner;

public class 쳲��������� {
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
		System.out.print("������һ������n:");
		int n = sc.nextInt();
		쳲��������� f = new 쳲���������();
		int res = f.Fibonacci(n);
		System.out.println(res);

	}

}
