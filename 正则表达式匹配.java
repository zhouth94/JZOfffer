package ��ָOfffer;

import java.util.Arrays;

public class ������ʽƥ�� {
	public boolean match(char[] str, char[] pattern) {
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(pattern));
		return matchReg(str, 0, pattern, 0);
	}

	private boolean matchReg(char[] str, int i, char[] pattern, int j) {
//		// �߽�
//		if (i == str.length && j == pattern.length) { // �ַ�����ģʽ����Ϊ��
//			return true;
//		} else if (j == pattern.length) { // ģʽ��Ϊ��
//			return false;
//		}
//
//		boolean next = (j + 1 < pattern.length && pattern[j + 1] == '*'); // ģʽ����һ���ַ���'*'
//		if (next) {
//			if (i < str.length && (pattern[j] == '.' || str[i] == pattern[j])) { // Ҫ��֤i<str.length������Խ��
//				return matchStr(str, i, pattern, j + 2) || matchStr(str, i + 1, pattern, j);
//			} else {
//				return matchStr(str, i, pattern, j + 2);
//			}
//		} else {
//			if (i < str.length && (pattern[j] == '.' || str[i] == pattern[j])) {
//				return matchStr(str, i + 1, pattern, j + 1);
//			} else {
//				return false;
//			}
//		}
		System.out.println("i" + i);
		System.out.println("j" + j);
		if (str.length == i && pattern.length == j)
			return true;
		if (str.length>i && pattern.length == j)
			return false;
		
		// pattern����һ���ַ���Ϊ*
		if ((pattern.length >(j+1)) && (pattern[j+1]=='*')) {
			if (str.length>i && (str[i] == pattern[j] || pattern[j] == '.')) {
				System.out.println("pattern[j+1]=='*') : " + str[i] + "," + pattern[j]);
				return matchReg(str, i + 1, pattern, j + 1) || matchReg(str, i, pattern, j + 2);
			}else
				return matchReg(str, i, pattern, j + 2);
		}else{
			{
				if (str.length > i && (str[i] == pattern[j] || pattern[j] == '.')) {
					System.out.println("pattern[j+1]!='*')" + str[i] + "��" +pattern[j]);
					return matchReg(str, i + 1, pattern, j) ;
				} else
					return false;
			}
		}

	}

	public static void main(String[] args) {
		������ʽƥ�� z = new ������ʽƥ��();
		char[] str = new char[] { 'a',  'a' };
		char[] pattern = new char[] { 'a','a' };

		boolean res = z.match(str, pattern);
		System.out.println(res);
	}

}
