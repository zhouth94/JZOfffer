package ��ָOfffer;

import org.junit.Test;

public class ���ַ���ת��������_������ʽ {
	public int StrToInt(String str){
		String reg = "[1-9,+,-]\\d+";
		if(!str.matches(reg))
			return 0;
		int len = str.length();
		int i = len - 1;
		long res = 0;
		//i���±�����ʼ��Ҳ�������ֵĸ�λ��ʼ
		while(i>=0 && str.charAt(i)>='0' && str.charAt(i)<='9'){
			res += Math.pow(10, len-1-i) * (str.charAt(i)-'0');
			System.out.println("res:" + res);
			i --;
		}
		res = ((str.charAt(0) == '-')? -res : res);
		if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
			return 0;
		return (int) res;
	}
	
	@Test
	public void test(){
		int res = StrToInt("123");
		System.out.println(res);
	}

}
