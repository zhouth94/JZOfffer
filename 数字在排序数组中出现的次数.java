package ��ָOfffer;

import java.util.Arrays;

public class ���������������г��ֵĴ��� {
	/**
	 * public static int binarySearch(int[] a,int key)
	 * ʹ�ö���������������ָ���� int �����飬�Ի��ָ����ֵ��
	 * �����ڽ��д˵���֮ǰ�������������ͨ�� sort(int[]) �����������û�ж�����������������ǲ�ȷ���ġ�
	 * �����������������ָ��ֵ��Ԫ�أ����޷���֤�ҵ�������һ���� 
	 * @param array
	 * @param k
	 * @return
	 */
	public int GetNumberOfK(int[] array, int k){
		if(array.length <= 0 || array==null)
			return -1;
		int index = Arrays.binarySearch(array, k);
		if(index < 0)
			return -1;
		int count = 0;
		//�����������������ָ��ֵ��Ԫ�أ����޷���֤�ҵ�������һ���� 
		for(int i = index+1; i < array.length && array[i] == k; i ++){
			count ++;
		}
		for(int i = index; i>= 0 && array[i] == k; i --){
			count ++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		���������������г��ֵĴ��� s = new ���������������г��ֵĴ���();
		int[] arr = new int[]{3,3,3,3,4,5};
		int res = s.GetNumberOfK(arr, 3);
		System.out.println(res);
	}

}
