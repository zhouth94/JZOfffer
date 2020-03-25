package 剑指Offfer;

import java.util.Scanner;

public class 跳台阶 {
	public int jumpFloor(int target){
		if(target==1 || target==2)
			return target;
		int[] arr = new int[target];
		arr[0] = 1;	//第一级台阶
		arr[1] = 2;	//第二级台阶
		//最后一跳:1 或者 2
		//target-1 或者 target-2
		//dp[i] = dp[i-1] + dp[i-2]
 		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[target-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入台阶目标值:");
		int n = sc.nextInt();
		跳台阶 t = new 跳台阶();
		int res = t.jumpFloor(n);
		System.out.println(res);

	}

}
