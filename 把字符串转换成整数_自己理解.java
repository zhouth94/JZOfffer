package 剑指Offfer;

public class 把字符串转换成整数_自己理解 {
	public static int StrToInt(String str) {
		if(str==null || str.length()<=0)
			return 0;
		
		char[] charArray = str.toCharArray();
		
		//设置一些标志
		int isbegin = 0; //表示开始检测数字
		int isnegative = 0; //表示是否是负数
		
		int res = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			if(isbegin == 0 && !(charArray[i] >= '0' && charArray[i] <= '9')) {
				if(charArray[i] == ' ') {
					continue;
				}else if(charArray[i] == '-') {
					isnegative = 1;
					isbegin = 1; //表示下一个字符将要检测数字
					continue;
				}else if(charArray[i] == '+') {
					isbegin = 1; //表示下一个字符将要检测数字
					continue;
				}else {
					return 0;
				}
			}else if(isbegin ==1 && charArray[i] >= '0' && charArray[i] <= '9') { // 检测数字
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
		int out = 把字符串转换成整数_自己理解.StrToInt(str);
		System.out.println(out);
	}

}






















