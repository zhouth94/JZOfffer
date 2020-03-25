package 剑指Offfer;

import java.util.Scanner;

public class 二进制中1的个数 {
	public int NumberOf1(int n){
		int count = 0;
		while(n != 0){
			n = n&(n-1);
			count ++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 12;
		System.out.println(Integer.toBinaryString(n));
		二进制中1的个数 e = new 二进制中1的个数();
		int res = e.NumberOf1(n);
		System.out.println(res);
	}

}
