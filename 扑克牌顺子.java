package 剑指Offfer;

import java.util.TreeSet;

import org.junit.Test;

public class 扑克牌顺子 {
	public boolean isContinuous(int[] numbers){
		//使用元素的自然顺序对元素进行排序，或者根据创建 set 时提供的 Comparator 进行排序
		if(numbers.length<5 || numbers.length>5)
			return false;
		TreeSet<Integer> set = new TreeSet<>();
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 0){
				count ++;
			}else{
				//set 中不包含0
				set.add(numbers[i]);
			}
		}
		if((count + set.size()) != 5){
			return false;
		}
		//数组中最大数与最小数之差不超过5
		if((set.last() - set.first()) < 5){
			return true;
		}
		return false;
	}
	
	@Test
	public void test(){
		
	}
}
