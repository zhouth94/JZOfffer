package 剑指Offfer;

/**
 * 归并排序:让左右两部分的元素先有序，然后把两个有序的部分合并为一个有序的
 * 是一个递归
 * 空间复杂度：O(N)，归并排序需要一个与原数组相同长度的数组做辅助来排序
 * 
 * 归并排序可以用来求逆序对数
 * 具体思路是，在归并的过程中计算每个小区间的逆序对数，进而计算出大区间的逆序对数
 * @author zhou
 *
 */
public class 归并排序 {
	public static void mergeSort(int[] arr){
		sort(arr, 0, arr.length-1);
	}
	
	public static void sort(int[] arr, int L, int R){
		if(L == R)
			return ;
		// >>是比特操作，右移一位，相当于除以2
		int mid = L + ((R-L)>>1);
		//递归
		sort(arr, L, mid);
		sort(arr, mid+1, R);
		merge(arr, L, mid, R);
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int[] tmp = new int[r-l+1];
		int i = 0;
		int p1 = l;
		int p2 = mid+1;
		//比较左右两部分元素，哪个小便放入tmp数组中
		while(p1<=mid && p2<=r){
			tmp[i] = (arr[p1]<arr[p2])?arr[p1++] :arr[p2++];
			i ++;
		}
		//循环退出后，把剩余的元素放入tmp
		while(p1 <= mid){
			tmp[i] = arr[p1];
			i ++;
			p1 ++;
		}
		while(p2 <= r){
			tmp[i++] = arr[p2++];
		}
		for (int j = 0; j < tmp.length; j++) {
			arr[l+j] = tmp[j];
		}
	}
	
	public static void main(String[] args) {
		归并排序 g = new 归并排序();
		int[] arr = new int[]{5, 4, 7, 9, 3, 8, 2, 1};
		归并排序.mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}















