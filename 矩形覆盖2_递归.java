package ��ָOfffer;

import java.util.Scanner;

public class ���θ���2_�ݹ� {
	public int RectCover(int target){
		if(target <= 2)
			return target;
		return RectCover(target-1) + RectCover(target - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ������n:");
		int n = sc.nextInt();
		���θ���2_�ݹ� j = new ���θ���2_�ݹ�();
		int res = j.RectCover(n);
		System.out.println(res);
	}

}
