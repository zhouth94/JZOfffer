package 剑指Offfer;

import java.util.Stack;

import org.junit.Test;

public class 翻转单词顺序列_2 {
	//使用栈
	public String ReverseSentence(String str){
		if(str==null || str.length()<=0)
			return "";
		//说明str中包含了空字符，所以长度大于0
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
