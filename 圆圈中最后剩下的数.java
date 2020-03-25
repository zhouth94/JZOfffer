package ��ָOfffer;

public class ԲȦ�����ʣ�µ��� {
	public int LastRemaining_Solution(int n,int m){
		if(n<=0 || m<1)
			return -1;
		//f[i]: i��ʾһ��i���ˣ�f[i]��ʾ���ʣ�µ��˵ı��
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
		ԲȦ�����ʣ�µ��� y = new ԲȦ�����ʣ�µ���();
		int res = y.LastRemaining_Solution(3, 3);
		System.out.println(res);
	}

}
