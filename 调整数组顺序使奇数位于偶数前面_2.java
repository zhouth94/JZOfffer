package 剑指Offfer;

import java.util.Arrays;
import java.util.Scanner;

public class 调整数组顺序使奇数位于偶数前面_2 {
	public void reOrderArray(int[] array){
		if(array==null || array.length<=1)
			return ;
		int i = 0;
		while(i < array.length){
			int j = i+1;
			//若i指向的数为偶数
			if(array[i]%2 == 0){
				//寻找j的指向，直至使j指向下一个奇数为止
				while(array[j]%2 == 0){
					if(j == array.length-1)
						return ;
					j ++;
				}
				//找到j所指向的奇数
				
				int interval = j-i;
				//交换下标i和j指向的值
				int tmp = array[i];
				array[i] = array[j];
				//将下标i和j之间的偶数分别往后移一位，左开右闭区间 (i,j]
				//因为array[i]的值已经改变，变成array[j]的值了
				//j = i+interval
				while(interval > 1){
					array[i+interval] = array[i+interval-1];
					interval --;
				}
				//此时需要填充array[i+1]的值
				array[i+1] = tmp;
			}
			i ++;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int n = sc.nextInt();
		System.out.print("请输入n个整数字符串(以逗号分隔):");
		String str = sc.next();
		
		int[] arr = new int[n];
		String[] numArray = str.split(",");
		for (int i = 0; i < numArray.length; i++) {
			arr[i] = Integer.parseInt(numArray[i]);
		}
		调整数组顺序使奇数位于偶数前面_2 t = new 调整数组顺序使奇数位于偶数前面_2();
		t.reOrderArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}




















