package 剑指Offfer;

import java.util.Arrays;
import java.util.Scanner;

public class 变态跳台阶_动态规划 {
	public int jumpFloorII(int target){
		if(target <= 2)
			return target;
		int[] dp = new int[target+1];
		Arrays.fill(dp, 1);
		dp[0] = 0;
		for(int i = 2;i <= target;i ++){
			for (int j = i-1; j >= 1; j--) {
				//跳n步可以跳上台阶
				dp[i] = dp[i] + dp[j];
			}
		}
		
		return dp[target];
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入台阶数:");
		int n = sc.nextInt();
		变态跳台阶_动态规划 b = new 变态跳台阶_动态规划();
		int res = b.jumpFloorII(n);
		System.out.println(res);

	}

}
