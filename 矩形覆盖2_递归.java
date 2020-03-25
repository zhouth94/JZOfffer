package ½£Ö¸Offfer;

import java.util.Scanner;

public class ¾ØÐÎ¸²¸Ç2_µÝ¹é {
	public int RectCover(int target){
		if(target <= 2)
			return target;
		return RectCover(target-1) + RectCover(target - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÒ»¸öÕûÊýn:");
		int n = sc.nextInt();
		¾ØÐÎ¸²¸Ç2_µÝ¹é j = new ¾ØÐÎ¸²¸Ç2_µÝ¹é();
		int res = j.RectCover(n);
		System.out.println(res);
	}

}
