package 剑指Offfer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 数组中重复的数字 {
	public boolean duplicate(int numbers[],int length,int[] duplication){
		if(numbers==null || length<=0)
			return false;
		boolean flag = false;
		Arrays.sort(numbers);
		int count = 0;
		//length = numbers.length;
		System.out.println("length" + length);
		for (int i = 0; i < length-1; i++) {
				System.out.println("numbers" + "[" + i + "]:" + numbers[i]);
				if(numbers[i] == numbers[i+1]){
					duplication[count] = numbers[i];
					return true;
				}
		}
		for(Integer tmp: duplication){
			System.out.println(tmp);
		}
		return flag;
	}
	
	public boolean duplicate_2(int numbers[],int length,int[] duplication){
		Set<Integer> set = new HashSet<Integer>();
		boolean flag = false;
		for (int i = 0; i < numbers.length; i++) {
			if(!set.contains(numbers[i])){
				set.add(numbers[i]);
			}else{
				flag = true;
				duplication[0] = numbers[i];
				return flag;
			}
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[]{2,4,2,1,4};
		int[] target = new int[10];
		数组中重复的数字 s = new 数组中重复的数字();
		boolean flag = s.duplicate(arr, arr.length, target);
		System.out.println(flag + "," + target[0]);
	}

}
