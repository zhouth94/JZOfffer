package ��ָOfffer;

public class ��һ��ֻ����һ�ε��ַ� {
	public int FirstNotRepeatingChar(String str){
		if(str==null || str.length()==0)
			return -1;
		int[] count = new int[123];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)] ++;
		}
		for (int i = 0; i < str.length(); i++) {
			if(count[str.charAt(i)] == 1)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		��һ��ֻ����һ�ε��ַ� d = new ��һ��ֻ����һ�ε��ַ�();
		int index = d.FirstNotRepeatingChar("aabcc");
		System.out.println(index);
	}

}
