package ��ָOfffer;

import java.util.Scanner;

public class ��ά�����еĲ��� {
	public boolean Find(int target,int[][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j] == target){
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������߽׵���:");
		int n = sc.nextInt();
		System.out.print("����������ͽ׵���:");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];		
		System.out.println("��������ĸ���Ԫ��:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("�����������Ϊ:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
				//���л���
				if(j == m-1){
					System.out.println();
				}
			}
		}
		��ά�����еĲ��� e = new ��ά�����еĲ���();
		System.out.print("��������Ҫ���ҵ�Ŀ������:");
		int target = sc.nextInt();
		boolean res = e.Find(target, arr);
		System.out.println(res);
	}

}




















