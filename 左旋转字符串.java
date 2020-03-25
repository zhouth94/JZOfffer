package 剑指Offfer;

import org.junit.Test;

public class 左旋转字符串 {
	public String LeftRotateString(String str,int n){
		//S=”abcXYZdef”	9
		//循环左移3位后的结果	
		//“XYZdefabc”
		/*if(str==null || "".equals(str))
			return "";
		if(n > str.length()){
			n = n % str.length();
		}
		String strA = str.substring(n, str.length());
		String strB = str.substring(0, n);
		return strA + strB; */
		if (str == null || n > str.length()) {
            return str;
        }
        return str.substring(n) + str.substring(0, n);
	}
	
	@Test
	public void test(){
		String str = "abcdefg";
		String res = LeftRotateString(str, 16);
		System.out.println(res);
	}

}
