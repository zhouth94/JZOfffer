package ��ָOfffer;

import java.util.Scanner;

public class ��������1�ĸ��� {
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
		��������1�ĸ��� e = new ��������1�ĸ���();
		int res = e.NumberOf1(n);
		System.out.println(res);
	}

}
