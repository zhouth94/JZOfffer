package ��ָOfffer;

import java.util.Comparator;
import java.util.PriorityQueue;

@SuppressWarnings("all")
public class �������е���λ�� {
	/**
	 * һ���������ȼ��ѵ��޽����ȼ����С����ȼ����е�Ԫ�ذ�������Ȼ˳��������򣬻��߸��ݹ������ʱ�ṩ�� Comparator ��������.
	 */
	PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
	
	PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(15, new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
		
	});
	
	private int count = 0;
	
	public void Insert(Integer num){
		/**
		 * n&1 ��n��1��λ�룬��Ϊ1�������λ������λ��Ϊ0�����԰�λ����ȡ����n���һλ�����n���һλ��1������Ϊ1.��֮���Ϊ0��
			��n&1��==1: �ж�n���һλ�ǲ���1�����������ж�nֵ����ż�ԣ���
			
			��������÷��š�&����ʾ����ʹ�ù������£�
			������������λ��Ϊ1�������Ϊ1��������Ϊ0
		 */
		if((count&1) == 0){//�ж�ż��
			//����Ϊż���Ļ������Ȳ��뵽�󶥶ѣ�Ȼ�󽫴󶥶�������������С������
			maxQueue.offer(num);
			int poll = maxQueue.poll();
			minQueue.offer(poll);
		}else{
			//����Ϊ�����Ļ������Ȳ��뵽С���ѣ�Ȼ��С��������С��������󶥶���
			minQueue.offer(num);
			Integer poll = minQueue.poll();
			maxQueue.offer(poll);
		}
		count ++;
	}
	

	public Double getMedian(){
		if(count <= 0)
			return (double) -1;
		double res = 0;
		if((count&1) == 0){//countΪż��
			res = (maxQueue.peek()+minQueue.peek()) / 2.0;
		}else{
			res = minQueue.peek();
		}
		return res;
	}
	
	public static void main(String[] args) {
		�������е���λ�� s = new �������е���λ��();
		s.Insert(5);
		s.Insert(2);
//		s.Insert(2);
		Double res = s.getMedian();
		System.out.println(res);
	}
}








