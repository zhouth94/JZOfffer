package ��ָOfffer;

import java.util.Stack;

public class ������ջʵ�ֶ��� {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	// ʹ��ջ1��Ԫ��ѹջ
	public void push(int node){
		stack1.push(node);
	}
	
	// ʹ��ջ2��ջ
	public int pop(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
