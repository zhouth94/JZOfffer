package ��ָOfffer;

import java.util.Scanner;

public class �滻�ո� {
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
		System.out.print("������һ���ַ���:");
		String str = sc.next();
		�滻�ո� t = new �滻�ո�();
		// ��Stringת��StringBuffer
		StringBuffer sb = new StringBuffer(str);
		String s = t.replaceSpace(sb);
		System.out.println(s);

	}

}
