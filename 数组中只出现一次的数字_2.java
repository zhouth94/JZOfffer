package 剑指Offfer;

import java.util.Arrays;
import java.util.Stack;

/**
 * 利用栈的特性
 * 首先将数组中元素依次入栈，若遇到相同的元素，则弹出栈；最后栈中剩下的就是所求
 * @author zhou
 *
 */
public class 数组中只出现一次的数字_2 {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]){
		//先将数组排序
		Arrays.sort(array);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < array.length; i++) {
			//stack.peek() 查看栈顶对象，不取出当前栈顶的元素
			if(stack.size()==0 || stack==null || stack.peek()!=array[i]){
				stack.add(array[i]);
			}else
				stack.pop();
		}
		num1[0] = stack.pop();
		num2[0] = stack.pop();
	}

}
