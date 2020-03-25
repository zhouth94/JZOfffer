package 剑指Offfer;

import java.util.Scanner;

public class 替换空格_2 {
	public String replaceSpace(StringBuffer str){
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if(str.charAt(i) == ' '){
				len += 2;
				str.replace(i, i+1, "%20");
			}
		}
		
		return str.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串:");
		String str = sc.next();
		替换空格 t = new 替换空格();
		// 将String转成StringBuffer
		StringBuffer sb = new StringBuffer();
		String s = t.replaceSpace(sb);
		System.out.println(s);


	}

}
