package ��ָOfffer;

import java.util.LinkedList;
import java.util.Queue;

public class �ַ����е�һ�����ظ����ַ�_2 {
	static int[] num = new int[128];
	//LinkedList��ʵ����Queue�ӿڣ�������ǿ��԰�LinkedList����Queue���á�
	Queue<Character> queue = new LinkedList<Character>();
	
	public void Insert(char ch){
		if(num[ch] == 0){	//δ���ֹ����ַ���Ϊ0
			queue.add(ch);
			num[ch] ++;	//Ȼ���1
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
			//num[ch] ��ʾ�ַ�������ÿ���ַ����ֵĴ�������0��ʼ����
			System.out.println("num[ch]" + num[ch]);
			num[ch] ++;
			System.out.println("num[ch] --- " + num[ch]);
			if(num[ch] == 1){
				System.out.println(ch);
			}
		}
	}

}
