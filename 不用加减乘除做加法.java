package 剑指Offfer;

public class 不用加减乘除做加法 {
	/**
	 * 第一步：相加各位的值，不算进位，二进制每位相加就相当于各位做异或操作； ^
	 * 第二步：计算进位值，相当于各位做与操作，再向左移一位。 ( & )<<1
	 * 第三步重复上述两步， 各位相加 ，计算进位值。进位值为0，跳出循环。
	 * @param num1
	 * @param nums2
	 * @return
	 */
	public int Add(int num1,int num2){
		int res = 0,carry = 0;
		do {
			//相加，也就是逻辑异或
			res = num1 ^ num2;
			//二进制进位，也就是( & )<<1
			carry = (num1 & num2) << 1;
			num1 = res;
			num2 = carry;
		} while (carry != 0);
		return res;
		
	}
	
	public static void main(String[] args) {
		不用加减乘除做加法 b = new 不用加减乘除做加法();
		int res = b.Add(5, 7);
		System.out.println(res);
	}
}
