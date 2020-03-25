package 剑指Offfer;

import java.util.LinkedList;
import java.util.Queue;

public class 字符流中第一个不重复的字符_2 {
	static int[] num = new int[128];
	//LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
	Queue<Character> queue = new LinkedList<Character>();
	
	public void Insert(char ch){
		if(num[ch] == 0){	//未出现过的字符记为0
			queue.add(ch);
			num[ch] ++;	//然后加1
		}
	}
	
	public char FirstAppearingOnce(){
		Character ct = null;
		while((ct=queue.peek()) != null){
			if(num[ct.charValue()] == 1){
				return ct;
			}else{
				queue.remove();
			}
		}
		return '#';
	}
	
	public static void main(String[] args) {
		Character[] arr = new Character[]{'a','b','b','r','c','b','d'};
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			//num[ch] 表示字符数组中每个字符出现的次数，从0开始计数
			System.out.println("num[ch]" + num[ch]);
			num[ch] ++;
			System.out.println("num[ch] --- " + num[ch]);
			if(num[ch] == 1){
				System.out.println(ch);
			}
		}
	}

}
