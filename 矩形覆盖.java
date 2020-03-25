package 剑指Offfer;

import java.util.Scanner;

public class 矩形覆盖 {
	public int RectCover(int target){
		if(target <= 2)
			return target;
		int[] arr = new int[target+1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for(int i = 3;i <= target;i ++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[target];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数n:");
		int n = sc.nextInt();
		矩形覆盖 j = new 矩形覆盖();
		int res = j.RectCover(n);
		System.out.println(res);
	}

}
