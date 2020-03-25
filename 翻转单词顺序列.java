package 剑指Offfer;

import org.junit.Test;

public class 翻转单词顺序列 {
	public String ReverseSentence(String str){
		if(str==null || str.length()<=0)
			return "";
		StringBuffer sb = new StringBuffer(str);
		//将字符串全部翻转
		sb.reverse();
		//初始化一个新的字符串
		StringBuffer newStr = new StringBuffer();
		//设置空白字符个数
		int blackNum = 0;
		int k = 0;
		for(int i = 0;i < sb.length();i ++){
			if(sb.charAt(i)==' ' && i!=(sb.length()-1)){
				StringBuffer str1 = new StringBuffer(sb.substring(k, i));
				//再翻转回正常顺序
				str1.reverse();
				newStr.append(str1 + " ");
				//注意k的下标位置
				k = i+1;
				blackNum ++;
			}
			//若原字符串str中有空格
			if(blackNum!=0 && i==(sb.length()-1)){
				StringBuffer str2 = new StringBuffer(sb.substring(k));
				str2.reverse();
				newStr.append(str2);
			}
			//若原字符串str中没有空格
			if(blackNum==0 && i==(sb.length()-1)){
				sb.reverse();
				newStr.append(sb);
			}
		}
		return newStr.toString();
	}
	
	@Test
	public void test(){
		String str = ReverseSentence("student. a am I");
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("student. a am I");
		sb.reverse();
		System.out.println(sb.toString());
	}
}
