package 剑指Offfer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 字符流中第一个不重复的字符 {
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	ArrayList<Character> list = new ArrayList<>();
	
	public void Insert(char ch){
		if(map.containsKey(ch)){
			map.put(ch, map.get(ch)+1);
		}else
			map.put(ch, 1);
		
		list.add(ch);
	}
	
	public char FirstAppearingOnce(){
		char c = '#';
		for(Character key: list){
			if(map.get(key) == 1){
				return key;
			}
		}
		return c;
		
	}
	
	public static void main(String[] args) {
//		ArrayList<Character> list = new ArrayList<>();
//		list.add('q');
//		list.add('a');
//		list.add('b');
//		list.add('z');
//		System.out.println(list);
		int[] arr = new int[7];//'a','b','c','r','c','b','d'
		
		System.out.println(Arrays.toString(arr));
	}

}
