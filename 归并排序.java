package ��ָOfffer;

/**
 * �鲢����:�����������ֵ�Ԫ��������Ȼ�����������Ĳ��ֺϲ�Ϊһ�������
 * ��һ���ݹ�
 * �ռ临�Ӷȣ�O(N)���鲢������Ҫһ����ԭ������ͬ���ȵ�����������������
 * 
 * �鲢��������������������
 * ����˼·�ǣ��ڹ鲢�Ĺ����м���ÿ��С�������������������������������������
 * @author zhou
 *
 */
public class �鲢���� {
	public static void mergeSort(int[] arr){
		sort(arr, 0, arr.length-1);
	}
	
	public static void sort(int[] arr, int L, int R){
		if(L == R)
			return ;
		// >>�Ǳ��ز���������һλ���൱�ڳ���2
		int mid = L + ((R-L)>>1);
		//�ݹ�
		sort(arr, L, mid);
		sort(arr, mid+1, R);
		merge(arr, L, mid, R);
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int[] tmp = new int[r-l+1];
		int i = 0;
		int p1 = l;
		int p2 = mid+1;
		//�Ƚ�����������Ԫ�أ��ĸ�С�����tmp������
		while(p1<=mid && p2<=r){
			tmp[i] = (arr[p1]<arr[p2])?arr[p1++] :arr[p2++];
			i ++;
		}
		//ѭ���˳��󣬰�ʣ���Ԫ�ط���tmp
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
		�鲢���� g = new �鲢����();
		int[] arr = new int[]{5, 4, 7, 9, 3, 8, 2, 1};
		�鲢����.mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}















