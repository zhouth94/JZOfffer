package ��ָOfffer;

import java.util.ArrayList;
import java.util.Arrays;

public class ��ΪS�������� {
	// [1,2,3,4,5,6,7,8,9,10]
	//���������ֳ˻���С
	public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
		Arrays.sort(array);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(sum<=0 || array==null)
			return list;
		int left = 0,right = array.length-1;
		while(left < right){
			int sumVal = array[left] + array[right];
			if(sumVal < sum){
				left ++;
			}else if(sumVal > sum){
				right --;
			}else{
				list.add(array[left]);
				list.add(array[right]);
				break;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		��ΪS�������� h = new ��ΪS��������();
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> resList = h.FindNumbersWithSum(arr, 12);
		System.out.println(resList);
	}

}
