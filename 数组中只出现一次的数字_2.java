package ��ָOfffer;

import java.util.Arrays;
import java.util.Stack;

/**
 * ����ջ������
 * ���Ƚ�������Ԫ��������ջ����������ͬ��Ԫ�أ��򵯳�ջ�����ջ��ʣ�µľ�������
 * @author zhou
 *
 */
public class ������ֻ����һ�ε�����_2 {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]){
		//�Ƚ���������
		Arrays.sort(array);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < array.length; i++) {
			//stack.peek() �鿴ջ�����󣬲�ȡ����ǰջ����Ԫ��
			if(stack.size()==0 || stack==null || stack.peek()!=array[i]){
				stack.add(array[i]);
			}else
				stack.pop();
		}
		num1[0] = stack.pop();
		num2[0] = stack.pop();
	}

}
