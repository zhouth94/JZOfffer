package 剑指Offfer;

public class 整数中1出现的次数从1到n整数中1出现的次数 {
	public int NumberOf1Between1AndN_Solution(int n){
		int sum = 0;
		for(int i = 1;i <= n;i ++){
			int num = f(i);
//			System.out.println("i =" + i);
			sum += num;
		}
		
		return sum;
	}

	private int f(int i) {
		String str = String.valueOf(i);
		char[] array = str.toCharArray();
		int count = 0;
		for (int j = 0; j < array.length; j++) {
			if(array[j] == '1'){
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		整数中1出现的次数从1到n整数中1出现的次数 z = new 整数中1出现的次数从1到n整数中1出现的次数();
		int res = z.NumberOf1Between1AndN_Solution(13);
		System.out.println(res);
	}
}
