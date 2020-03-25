package 剑指Offfer;

/**
 * 要求不能使用字符串转换整数的库函数
 * @author zhou
 *
 */
public class 把字符串转换成整数 {
	/**
	 * java 正则表达式:
	 * 例如： ^\d+(\.\d+)?
	 * 	^ 定义了以什么开始
		\d+ 匹配一个或多个数字
		? 设置括号内的选项是可选的	
		\. 匹配 "."
		可以匹配的实例："5", "1.5" 和 "2.21"。
		
		
		"\\d[1-9]"是一个正则表达式，用于匹配两位数字，第一位从0到9都可以，第二位从1到9都可以。
		“\\d”是表示数字的正则类，相当于[0-9]。
		所以这个写法，相当于写data.matches("[0-9][1-9]");
		比如“01”，“02”，“12”这些都是匹配的，match()方法返回true
		而“10”，“20”，“321”这些都不匹配，返回false
		
		
		\\d[1-9] 与  \\d{1,9} 的区别
		
		
res = (res << 1) + (res << 3) + (str[i] & 0xf);
对这句话的解释： (res << 1) + (res << 3)，左移一位是乘以2，左移3位是乘以8，加起来相当于res*10；
(str[i] & 0xf) 相当于 str[i] - '0'，为什么呢？因为 字符'0' ~ '9' 的SACII码值的低四个二进制位就是 0 ~ 9， 
0xf 是数字15，二进制位1111，这样操作之后就可以将 ‘0’ 转化为0，...，将‘9’转化为‘9’。
	 * @param str
	 * @return
	 */
	public int StrToInt(String str){
		if(str==null || str.length()==0)
			return 0;
		int len = str.length();
		int flag = 1;
		if(str.charAt(0) == '-')
			flag = -1;
		long res = 0;
		for(int i = (str.charAt(0) == '+'||str.charAt(0) == '-')? 1:0; i < len;i ++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				res = (res << 1) + (res << 3) + (str.charAt(i)&0xf);
			}else
				return 0;
		}
		
		//还需要是否越界，是否一个合法的数值
		if(flag == 1){
			if(res > Integer.MAX_VALUE)
				return 0;
		}
		if(flag == -1){
			if(res*flag < Integer.MIN_VALUE)
				return 0;
		}
		return (int) (res * flag);
	}
	
	public static void main(String[] args) {
		String str =  "11";
		if(str.matches("[1-9,+,-]\\d+")==true)
			System.out.println(str);
		else
			System.out.println(-1);
//		把字符串转换成整数 b = new 把字符串转换成整数();
//		int res = b.StrToInt("-2147483649");
//		System.out.println(res);
	}

}

















