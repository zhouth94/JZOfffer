package ��ָOfffer;

import java.util.Scanner;

public class ��̨�� {
	public int jumpFloor(int target){
		if(target==1 || target==2)
			return target;
		int[] arr = new int[target];
		arr[0] = 1;	//��һ��̨��
		arr[1] = 2;	//�ڶ���̨��
		//���һ��:1 ���� 2
		//target-1 ���� target-2
		//dp[i] = dp[i-1] + dp[i-2]
 		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[target-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������̨��Ŀ��ֵ:");
		int n = sc.nextInt();
		��̨�� t = new ��̨��();
		int res = t.jumpFloor(n);
		System.out.println(res);

	}

}
