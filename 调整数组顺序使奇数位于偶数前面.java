package ��ָOfffer;

import java.util.Arrays;
import java.util.Scanner;

public class ��������˳��ʹ����λ��ż��ǰ�� {
	public void reOrderArray(int[] array){
		if(array.length==0 || array==null)
			return ;
		int size = array.length;
		boolean flag = false;
		do{
			for (int i = 0; i < array.length-1; i++) {
				if(array[i]%2 == 0 && (array[i+1]%2 == 1)){
					swap(array, i, i+1);
					flag = true;
				}
			}
			if(!flag)
				return ;
		}while(size-- > 0);
	}
	
	public void swap(int[] arr,int i,int j){
		int tmp;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ������:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		��������˳��ʹ����λ��ż��ǰ�� t = new ��������˳��ʹ����λ��ż��ǰ��();
		t.reOrderArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}




















