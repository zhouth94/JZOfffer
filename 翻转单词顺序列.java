package ��ָOfffer;

import org.junit.Test;

public class ��ת����˳���� {
	public String ReverseSentence(String str){
		if(str==null || str.length()<=0)
			return "";
		StringBuffer sb = new StringBuffer(str);
		//���ַ���ȫ����ת
		sb.reverse();
		//��ʼ��һ���µ��ַ���
		StringBuffer newStr = new StringBuffer();
		//���ÿհ��ַ�����
		int blackNum = 0;
		int k = 0;
		for(int i = 0;i < sb.length();i ++){
			if(sb.charAt(i)==' ' && i!=(sb.length()-1)){
				StringBuffer str1 = new StringBuffer(sb.substring(k, i));
				//�ٷ�ת������˳��
				str1.reverse();
				newStr.append(str1 + " ");
				//ע��k���±�λ��
				k = i+1;
				blackNum ++;
			}
			//��ԭ�ַ���str���пո�
			if(blackNum!=0 && i==(sb.length()-1)){
				StringBuffer str2 = new StringBuffer(sb.substring(k));
				str2.reverse();
				newStr.append(str2);
			}
			//��ԭ�ַ���str��û�пո�
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
