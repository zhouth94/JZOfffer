package ��ָOfffer;

import java.util.TreeSet;

import org.junit.Test;

public class �˿���˳�� {
	public boolean isContinuous(int[] numbers){
		//ʹ��Ԫ�ص���Ȼ˳���Ԫ�ؽ������򣬻��߸��ݴ��� set ʱ�ṩ�� Comparator ��������
		if(numbers.length<5 || numbers.length>5)
			return false;
		TreeSet<Integer> set = new TreeSet<>();
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 0){
				count ++;
			}else{
				//set �в�����0
				set.add(numbers[i]);
			}
		}
		if((count + set.size()) != 5){
			return false;
		}
		//���������������С��֮�����5
		if((set.last() - set.first()) < 5){
			return true;
		}
		return false;
	}
	
	@Test
	public void test(){
		
	}
}
