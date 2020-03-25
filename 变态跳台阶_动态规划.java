package ��ָOfffer;

import java.util.Arrays;
import java.util.Scanner;

public class ��̬��̨��_��̬�滮 {
	public int jumpFloorII(int target){
		if(target <= 2)
			return target;
		int[] dp = new int[target+1];
		Arrays.fill(dp, 1);
		dp[0] = 0;
		for(int i = 2;i <= target;i ++){
			for (int j = i-1; j >= 1; j--) {
				//��n����������̨��
				dp[i] = dp[i] + dp[j];
			}
		}
		
		return dp[target];
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������̨����:");
		int n = sc.nextInt();
		��̬��̨��_��̬�滮 b = new ��̬��̨��_��̬�滮();
		int res = b.jumpFloorII(n);
		System.out.println(res);

	}

}
