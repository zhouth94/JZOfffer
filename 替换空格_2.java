package ��ָOfffer;

import java.util.Scanner;

public class �滻�ո�_2 {
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
		System.out.print("������һ���ַ���:");
		String str = sc.next();
		�滻�ո� t = new �滻�ո�();
		// ��Stringת��StringBuffer
		StringBuffer sb = new StringBuffer();
		String s = t.replaceSpace(sb);
		System.out.println(s);


	}

}
