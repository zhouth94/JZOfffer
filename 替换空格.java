package 剑指Offfer;

import java.util.Scanner;

public class 替换空格 {
	public String replaceSpace(StringBuffer str){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((int)ch == 32){
				sb.append("%20");
			}else{
				sb.append(ch);
			}
		}
		System.out.println(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		/*StringBuffer s = new StringBuffer("We Are Happy");
		char c = s.charAt(2);
		System.out.println((int)c);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串:");
		String str = sc.next();
		替换空格 t = new 替换空格();
		// 将String转成StringBuffer
		StringBuffer sb = new StringBuffer(str);
		String s = t.replaceSpace(sb);
		System.out.println(s);

	}

}
