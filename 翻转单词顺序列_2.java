package ��ָOfffer;

import java.util.Stack;

import org.junit.Test;

public class ��ת����˳����_2 {
	//ʹ��ջ
	public String ReverseSentence(String str){
		if(str==null || str.length()<=0)
			return "";
		//˵��str�а����˿��ַ������Գ��ȴ���0
		if(str.trim().equals("") && str.length()>0)
			return str;
		str = str.trim();
		Stack stack = new Stack();
		String[] strs = str.split(" ");
		for(String tmp: strs){
			stack.push(tmp);
		}
		String res = (String) stack.pop();
		while(!stack.isEmpty()){
			res = res + " " + stack.pop();
		}
		return res;
	}
	
	@Test
	public void test(){
		String str = ReverseSentence(" world! hello ");
		System.out.println(str);
	}

}
