package 剑指Offfer;

import java.util.ArrayList;
import java.util.Scanner;

public class 顺时针打印矩阵 {
	public ArrayList<Integer> printMatrix(int[][] matrix){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(matrix==null || matrix.length==0 || matrix[0]==null)
			return list;
		int up = 0,right = matrix[0].length-1,down = matrix.length-1,left = 0;
		while(true){
			//最上一行
			for(int col = left;col <= right;col ++){
				list.add(matrix[up][col]);
			}
			up ++;
			if(up > down)
				break;
			//最右边一列
			for (int row = up; row <= down; row++) {	//极其容易错
				list.add(matrix[row][right]);	//matrix[row][right]
			}
			right --;
			if(right < left)
				break;
			//最下面一行
			for (int col = right; col >= left; col --) {
				list.add(matrix[down][col]);
			}
			down --;
			if(down < up)
				break;
			//最左边一列
			for (int row = down; row >= up; row--) {
				list.add(matrix[row][left]);
			}
			left ++;
			if(left > right)
				break;
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int n = sc.nextInt();
		int[][] arr= new int[n][n];
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + ",");
			}
		}
		顺时针打印矩阵 s = new 顺时针打印矩阵();
		ArrayList<Integer> list = s.printMatrix(arr);
		System.out.println(list.toString());
		
	}

}









