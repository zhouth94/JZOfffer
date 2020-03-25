package 剑指Offfer;

import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;

public class 数据流中的中位数_2 {
	/**
	 * 基于红黑树（Red-Black tree）的 NavigableMap 实现。
	 * 该映射根据其键的自然顺序进行排序，或者根据创建映射时提供的 Comparator 进行排序，具体取决于使用的构造方法。
	 * @param num
	 */
	
	private TreeMap<Integer,Integer> map = new TreeMap<>();
	
	public void Insert(Integer num){
		if(map.containsKey(num)){
			int count = map.get(num);
			map.put(num, count+1);
		}else{
			map.put(num, 1);
		}
		
	}
	
	public Double GetMedian(){
		int size = map.size();
		System.out.println("size:" + size);
		Entry<Integer, Integer> entry = map.firstEntry();
		System.out.println("entry" + entry);
		int key = entry.getKey();
		int value = entry.getValue();
		System.out.println(key + ":" + value);
		int mid = size / 2;
		
		
		while(value < mid){
			entry = map.higherEntry(entry.getKey());
			value += entry.getValue();
		}
		double res = 0.0;
		//找到中间位置
		if((size&1)==0 && mid==value){
			key = entry.getKey();
			res = (entry.getKey() * 1. + map.higherEntry(key).getKey() * 1.) / 2.;
		}else{
			res = entry.getKey();
		}
		
		return res;
		
		
	}
	
	public static void main(String[] args) {
		数据流中的中位数_2 s = new 数据流中的中位数_2();
		s.Insert(5);
		s.Insert(2);
		
		Double res = s.GetMedian();
		System.out.println(res);
	}

}
