package 剑指Offfer;

import java.util.ArrayList;

public class 和为S的两个数_2 {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(sum<=0 || array.length<2)
			return list;
		for (int i = 0; i < array.length-1; i++) {
			int k = i+1;
			int tmp = sum - array[i];
			for(int j =k;j < array.length;j ++){
				if(array[j] == tmp){
					list.add(array[i]);
					list.add(array[j]);
					return list;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		和为S的两个数_2 h = new 和为S的两个数_2();
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		ArrayList<Integer> resList = h.FindNumbersWithSum(arr, 21);
		System.out.println(resList);
	}
}
