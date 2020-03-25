package 剑指Offfer;

import java.util.Stack;

public class 用两个栈实现队列 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	// 使用栈1将元素压栈
	public void push(int node){
		stack1.push(node);
	}
	
	// 使用栈2出栈
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
