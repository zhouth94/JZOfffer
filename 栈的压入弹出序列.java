package ��ָOfffer;

import java.util.Stack;

public class ջ��ѹ�뵯������ {
	public boolean IsPopOrder(int[] pushA,int[] popA){
		if(pushA.length==0 || popA.length==0 || pushA.length!=popA.length)
			return false;
		Stack<Integer> stack = new Stack<>();
		int i = 0;
		//��Ԫ�ص���ջ��Ԫ��ʱ����ջ
		for (int j = 0; j < popA.length; j++) {
			stack.push(pushA[j]);
			while(!stack.isEmpty() && stack.peek()==popA[i]){
				stack.pop();
				i ++;
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
	}

}
