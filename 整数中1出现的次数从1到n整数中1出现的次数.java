package ��ָOfffer;

public class ������1���ֵĴ�����1��n������1���ֵĴ��� {
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
		������1���ֵĴ�����1��n������1���ֵĴ��� z = new ������1���ֵĴ�����1��n������1���ֵĴ���();
		int res = z.NumberOf1Between1AndN_Solution(13);
		System.out.println(res);
	}
}
