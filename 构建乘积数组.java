package 剑指Offfer;

import java.util.Arrays;

public class 构建乘积数组 {
	public int[] multiply(int[] A){
		//B[i] = A[0]*A[1]*A[2]...A[i-1]*A[i+1]*A[i+2]*...*A[n-1]
		//从左到右算 B[i]=A[0]*A[1]*...*A[i-1]
		//从右到左算B[i]*=A[i+1]*...*A[n-1]
		int len = A.length;
		int[] B = new int[len];
		int res = 1;
		//计算下三角
		for(int i = 0;i < len;i ++){
			B[i] = res;//B[0]=1		B[1]=A[0]		B[2]=A[0]A[1]		B[3]=A[0]A[1]A[2]	B[len-1]=A[0]A[1]...A[len-2]
			res *= A[i];//res=A[0]	res=A[0]A[1]	res=A[0]A[1]A[2]
		}
		res = 1;
		//计算上三角
		for(int i = len-1;i >= 0;i --){
			B[i] = B[i]*res;//B[len-1]=B[len-1]		B[len-2]=A[0]A[1]...A[len-3]A[len-1]	B[len-3]=B[len-3]A[len-1]A[len-2]
			res *= A[i];		//res=A[len-1]			res=A[len-1]A[len-2]
		}
		return B;	
	}
	
	public static void main(String[] args) {
		构建乘积数组 g = new 构建乘积数组();
		int[] A = new int[]{1,2,3,4,5};
		int[] B = g.multiply(A);
		System.out.println(Arrays.toString(B));
	}

}
