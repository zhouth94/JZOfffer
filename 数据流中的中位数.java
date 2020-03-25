package 剑指Offfer;

import java.util.Comparator;
import java.util.PriorityQueue;

@SuppressWarnings("all")
public class 数据流中的中位数 {
	/**
	 * 一个基于优先级堆的无界优先级队列。优先级队列的元素按照其自然顺序进行排序，或者根据构造队列时提供的 Comparator 进行排序.
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
		 * n&1 把n与1按位与，因为1除了最低位，其他位都为0，所以按位与结果取决于n最后一位，如果n最后一位是1，则结果为1.反之结果为0。
			（n&1）==1: 判断n最后一位是不是1（可能用来判断n值的奇偶性）。
			
			与运算符用符号“&”表示，其使用规律如下：
			两个操作数中位都为1，结果才为1，否则结果为0
		 */
		if((count&1) == 0){//判断偶数
			//个数为偶数的话，则先插入到大顶堆，然后将大顶堆中最大的数插入小顶堆中
			maxQueue.offer(num);
			int poll = maxQueue.poll();
			minQueue.offer(poll);
		}else{
			//个数为奇数的话，则先插入到小顶堆，然后将小顶堆中最小的数插入大顶堆中
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
		if((count&1) == 0){//count为偶数
			res = (maxQueue.peek()+minQueue.peek()) / 2.0;
		}else{
			res = minQueue.peek();
		}
		return res;
	}
	
	public static void main(String[] args) {
		数据流中的中位数 s = new 数据流中的中位数();
		s.Insert(5);
		s.Insert(2);
//		s.Insert(2);
		Double res = s.getMedian();
		System.out.println(res);
	}
}








