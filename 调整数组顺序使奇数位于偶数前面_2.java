package ��ָOfffer;

import java.util.Arrays;
import java.util.Scanner;

public class ��������˳��ʹ����λ��ż��ǰ��_2 {
	public void reOrderArray(int[] array){
		if(array==null || array.length<=1)
			return ;
		int i = 0;
		while(i < array.length){
			int j = i+1;
			//��iָ�����Ϊż��
			if(array[i]%2 == 0){
				//Ѱ��j��ָ��ֱ��ʹjָ����һ������Ϊֹ
				while(array[j]%2 == 0){
					if(j == array.length-1)
						return ;
					j ++;
				}
				//�ҵ�j��ָ�������
				
				int interval = j-i;
				//�����±�i��jָ���ֵ
				int tmp = array[i];
				array[i] = array[j];
				//���±�i��j֮���ż���ֱ�������һλ�����ұ����� (i,j]
				//��Ϊarray[i]��ֵ�Ѿ��ı䣬���array[j]��ֵ��
				//j = i+interval
				while(interval > 1){
					array[i+interval] = array[i+interval-1];
					interval --;
				}
				//��ʱ��Ҫ���array[i+1]��ֵ
				array[i+1] = tmp;
			}
			i ++;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ������:");
		int n = sc.nextInt();
		System.out.print("������n�������ַ���(�Զ��ŷָ�):");
		String str = sc.next();
		
		int[] arr = new int[n];
		String[] numArray = str.split(",");
		for (int i = 0; i < numArray.length; i++) {
			arr[i] = Integer.parseInt(numArray[i]);
		}
		��������˳��ʹ����λ��ż��ǰ��_2 t = new ��������˳��ʹ����λ��ż��ǰ��_2();
		t.reOrderArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}




















