package 剑指Offfer;

import java.util.Arrays;

public class 数字在排序数组中出现的次数 {
	/**
	 * public static int binarySearch(int[] a,int key)
	 * 使用二分搜索法来搜索指定的 int 型数组，以获得指定的值。
	 * 必须在进行此调用之前对数组进行排序（通过 sort(int[]) 方法）。如果没有对数组进行排序，则结果是不确定的。
	 * 如果数组包含多个带有指定值的元素，则无法保证找到的是哪一个。 
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
		//如果数组包含多个带有指定值的元素，则无法保证找到的是哪一个。 
		for(int i = index+1; i < array.length && array[i] == k; i ++){
			count ++;
		}
		for(int i = index; i>= 0 && array[i] == k; i --){
			count ++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		数字在排序数组中出现的次数 s = new 数字在排序数组中出现的次数();
		int[] arr = new int[]{3,3,3,3,4,5};
		int res = s.GetNumberOfK(arr, 3);
		System.out.println(res);
	}

}
