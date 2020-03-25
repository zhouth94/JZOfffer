package 剑指Offfer;

import java.util.Arrays;

public class 正则表达式匹配 {
	public boolean match(char[] str, char[] pattern) {
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(pattern));
		return matchReg(str, 0, pattern, 0);
	}

	private boolean matchReg(char[] str, int i, char[] pattern, int j) {
//		// 边界
//		if (i == str.length && j == pattern.length) { // 字符串和模式串都为空
//			return true;
//		} else if (j == pattern.length) { // 模式串为空
//			return false;
//		}
//
//		boolean next = (j + 1 < pattern.length && pattern[j + 1] == '*'); // 模式串下一个字符是'*'
//		if (next) {
//			if (i < str.length && (pattern[j] == '.' || str[i] == pattern[j])) { // 要保证i<str.length，否则越界
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
		
		// pattern的下一个字符不为*
		if ((pattern.length >(j+1)) && (pattern[j+1]=='*')) {
			if (str.length>i && (str[i] == pattern[j] || pattern[j] == '.')) {
				System.out.println("pattern[j+1]=='*') : " + str[i] + "," + pattern[j]);
				return matchReg(str, i + 1, pattern, j + 1) || matchReg(str, i, pattern, j + 2);
			}else
				return matchReg(str, i, pattern, j + 2);
		}else{
			{
				if (str.length > i && (str[i] == pattern[j] || pattern[j] == '.')) {
					System.out.println("pattern[j+1]!='*')" + str[i] + "、" +pattern[j]);
					return matchReg(str, i + 1, pattern, j) ;
				} else
					return false;
			}
		}

	}

	public static void main(String[] args) {
		正则表达式匹配 z = new 正则表达式匹配();
		char[] str = new char[] { 'a',  'a' };
		char[] pattern = new char[] { 'a','a' };

		boolean res = z.match(str, pattern);
		System.out.println(res);
	}

}
