package 剑指Offfer;

import java.util.ArrayList;

public class 最小的k个数 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k){
		ArrayList<Integer> list = new ArrayList<>();
		if(k==0 || k > input.length)
			return list;
		int len = input.length;
		quickSort(input);
		for(int i = 0;i < k;i ++){
			list.add(input[i]);
		}
		return list;
		
	}
	
	public void quickSort(int[] arr){
		if(arr.length > 0){
			sort(arr, 0, arr.length-1);
		}
	}

	private void sort(int[] arr, int low, int height) {
		int i = low;
		int j = height;
		if(i > j){
			return;
		}
		//设置基准数arr[i]
		int k = arr[i];
		while(i < j){
			//从后往前开始找出比基准数小的数
			while(i<j && arr[j]>k){
				j --;
			}
			//从前往后找出比基准数大的数
			while(i<j && arr[i]<=k){
				i ++;
			}
			if(i < j){
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		//交换K
		k = arr[i];
		arr[i] = arr[low];
		arr[low] = k;
		//对k左边的数进行排序
		sort(arr, low, i-1);
		sort(arr, i+1, height);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{4,5,1,6,2,7,3,8};
		最小的k个数 z = new 最小的k个数();
		ArrayList<Integer> res = z.GetLeastNumbers_Solution(arr, 4);
		System.out.println(res.toString());
	}
	
}

