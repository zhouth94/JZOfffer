package 剑指Offfer;

public class 整数中1出现的次数从1到n整数中1出现的次数_2 {
	public int NumberOf1Between1AndN_Solution(int n){
		int count = 0;
		for(int i = n;i >= 1;i --){
			for(int j = i;j >= 1;j /= 10){
				if(j % 10 ==1){
					count ++;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		整数中1出现的次数从1到n整数中1出现的次数_2 z = new 整数中1出现的次数从1到n整数中1出现的次数_2();
		int res = z.NumberOf1Between1AndN_Solution(13);
		System.out.println(res);
	}
}
