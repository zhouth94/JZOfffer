package ��ָOfffer;

public class ��������������� {
	public int FindGreatestSumOfSubArray(int[] array){
		int len = array.length;
		int[] dp = new int[len];
		dp[0] = array[0];
		int max = array[0];
		for(int i = 1;i < len;i ++){
			int newMax = dp[i-1] + array[i];
			if(newMax < array[i])
				dp[i] = array[i];
			else
				dp[i] = newMax;
			System.out.println("dp = " + dp[i]);
			if(dp[i] > max)
				max = dp[i];
			System.out.println("max = " + max);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		��������������� l = new ���������������();
		int[] arr = {-2,-8,-1,-5,-9};
		int res = l.FindGreatestSumOfSubArray(arr);
		System.out.println(res);
	}

}
