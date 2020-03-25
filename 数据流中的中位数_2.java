package ��ָOfffer;

import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;

public class �������е���λ��_2 {
	/**
	 * ���ں������Red-Black tree���� NavigableMap ʵ�֡�
	 * ��ӳ������������Ȼ˳��������򣬻��߸��ݴ���ӳ��ʱ�ṩ�� Comparator �������򣬾���ȡ����ʹ�õĹ��췽����
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
		//�ҵ��м�λ��
		if((size&1)==0 && mid==value){
			key = entry.getKey();
			res = (entry.getKey() * 1. + map.higherEntry(key).getKey() * 1.) / 2.;
		}else{
			res = entry.getKey();
		}
		
		return res;
		
		
	}
	
	public static void main(String[] args) {
		�������е���λ��_2 s = new �������е���λ��_2();
		s.Insert(5);
		s.Insert(2);
		
		Double res = s.GetMedian();
		System.out.println(res);
	}

}
