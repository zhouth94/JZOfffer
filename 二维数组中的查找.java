package 剑指Offfer;

import java.util.Scanner;

public class 二维数组中的查找 {
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
		System.out.print("请输入数组高阶的数:");
		int n = sc.nextInt();
		System.out.print("请输入数组低阶的数:");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];		
		System.out.println("输入数组的各个元素:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("你输入的数组为:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + "\t");
				//进行换行
				if(j == m-1){
					System.out.println();
				}
			}
		}
		二维数组中的查找 e = new 二维数组中的查找();
		System.out.print("请输入需要查找的目标数字:");
		int target = sc.nextInt();
		boolean res = e.Find(target, arr);
		System.out.println(res);
	}

}




















