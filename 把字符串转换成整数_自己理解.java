package ��ָOfffer;

public class ���ַ���ת��������_�Լ���� {
	public static int StrToInt(String str) {
		if(str==null || str.length()<=0)
			return 0;
		
		char[] charArray = str.toCharArray();
		
		//����һЩ��־
		int isbegin = 0; //��ʾ��ʼ�������
		int isnegative = 0; //��ʾ�Ƿ��Ǹ���
		
		int res = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			if(isbegin == 0 && !(charArray[i] >= '0' && charArray[i] <= '9')) {
				if(charArray[i] == ' ') {
					continue;
				}else if(charArray[i] == '-') {
					isnegative = 1;
					isbegin = 1; //��ʾ��һ���ַ���Ҫ�������
					continue;
				}else if(charArray[i] == '+') {
					isbegin = 1; //��ʾ��һ���ַ���Ҫ�������
					continue;
				}else {
					return 0;
				}
			}else if(isbegin ==1 && charArray[i] >= '0' && charArray[i] <= '9') { // �������
				int push = charArray[i] - '0';
				
//				System.out.println("res:" + res);
				if(isnegative == 0 && (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && push > 7))) {
					return 0;
				}
				if(isnegative == 1 && (res >= Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && push >= 8))) {
					return 0;
				}
				res *= 10;
				res += push;
				
			}else {
				return 0;
			}
		}
		
		if(isnegative == 1 && res != Integer.MIN_VALUE) {
			res = -1 * res;
		}
		return res;
	}
	
	public static void main(String[] args) {
		String str = "    1a33";
		int out = ���ַ���ת��������_�Լ����.StrToInt(str);
		System.out.println(out);
	}

}






















