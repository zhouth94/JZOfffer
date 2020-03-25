package 剑指Offfer;

import java.util.HashMap;

public class 数组中只出现一次的数字 {
	//num1, num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < array.length;i ++){
			if(map.containsKey(array[i])){
				map.put(array[i], 2);
			}else{
				map.put(array[i], 1);
			}
		}
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if(map.get(array[i]) == 1){
				if(count == 0){
					num1[0] = array[i];
					count ++;
				}
				num2[0] = array[i];
			}
		}
				
	}

}
