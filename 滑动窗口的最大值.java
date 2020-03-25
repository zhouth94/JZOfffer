package ��ָOfffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ʹ��PriorityQueue �󶥶ѣ�ÿ�λ��������ƶ�һλ��ǰ��һ�������ѣ�����һ������ѡ�
 * @author zhou
 *
 */
@SuppressWarnings("all")
public class �������ڵ����ֵ {
	
	
	private PriorityQueue<Integer> maxQueue = new PriorityQueue<>(15, new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
		
	});
	
	public ArrayList<Integer> maxInWindows(int[] num,int size){
		ArrayList<Integer> result = new ArrayList<>();
		if(num==null || num.length<size || num.length<0 || size<0)
			return null;
		
		int count = 0;
		for (count = 0; count < size; count++) {
			maxQueue.offer(num[count]);
		}
		
		while(count < num.length){
			Integer peek = maxQueue.peek();
			result.add(peek);
			//ɾ��maxQueue�е�һ������Ҳ����num�����еĵ�һ����
			maxQueue.remove(num[count-size]);
			maxQueue.offer(num[count++]);
		}
		result.add(maxQueue.peek());
		
		return result;
	}
	
	public static void main(String[] args) {
		�������ڵ����ֵ h = new �������ڵ����ֵ();
		ArrayList<Integer> res = h.maxInWindows(new int[]{2,3,4,2,6,2,5,1}, 3);
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}

}
















