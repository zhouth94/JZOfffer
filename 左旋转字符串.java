package ��ָOfffer;

import org.junit.Test;

public class ����ת�ַ��� {
	public String LeftRotateString(String str,int n){
		//S=��abcXYZdef��	9
		//ѭ������3λ��Ľ��	
		//��XYZdefabc��
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
