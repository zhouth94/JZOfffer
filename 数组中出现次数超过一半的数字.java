package 剑指Offfer;

public class 数组中出现次数超过一半的数字 {
	//{1,2,3,2,2,2,5,4,2}
	public int MoreThanHalfNum_Solution(int[] array){
		int len = array.length;
		if(len == 1)
			return array[0];
		int count = 1, max = 0;
		int index = 0;
		for(int i = 0;i < len-1; i ++){
			for(int j = i+1;j < len;j ++){
				int num = array[i];
				if(num == array[j]){
					count ++;
				}
			}
			//第一层for循环结束
			if(count > max && (count > len/2)){
				index = i;
				max = count;
			}
			count = 1;
		}
		if(max <= len/2)
			return 0;
		return array[index];
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{1};
		数组中出现次数超过一半的数字 s = new 数组中出现次数超过一半的数字();
		int res = s.MoreThanHalfNum_Solution(arr);
		System.out.println(res);
	}

}
