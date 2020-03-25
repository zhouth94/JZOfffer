package 剑指Offfer;

public class 圆圈中最后剩下的数 {
	public int LastRemaining_Solution(int n,int m){
		if(n<=0 || m<1)
			return -1;
		//f[i]: i表示一共i个人，f[i]表示最后剩下的人的编号
		//f[i] = (f[i-1] + m) % i 
		int[] f = new int[n+1];
		f[1] = 0;
		for(int i = 2;i <= n;i ++){
			f[i] = (f[i-1] + m) % i;
			System.out.println("f["+i+"] = " + f[i]);
		}
		return f[n];
	}
	
	/*@Test
	public void test(){
		int res = LastRemaining_Solution(1, 3);
		System.out.println(res);
	}*/
	
	public static void main(String[] args) {
		圆圈中最后剩下的数 y = new 圆圈中最后剩下的数();
		int res = y.LastRemaining_Solution(3, 3);
		System.out.println(res);
	}

}
