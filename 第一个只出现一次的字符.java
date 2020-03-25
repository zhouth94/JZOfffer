package 剑指Offfer;

public class 第一个只出现一次的字符 {
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
		第一个只出现一次的字符 d = new 第一个只出现一次的字符();
		int index = d.FirstNotRepeatingChar("aabcc");
		System.out.println(index);
	}

}
