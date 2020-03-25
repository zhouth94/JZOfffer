package 剑指Offfer;

/**
 * 若实现Comparator接口，则需要重写compare方法
 * public int compare(String o1, String o2){
 * 		return o1.compareTo(o2);
 * }
 * 
 * 若实现Comparable接口，则重写compareTo方法
 * public int compareTo(Student o){
 * 		if(this.score > o.score)	return 1;
 * }
 * @author zhou
 *
 */
public class 把数组排成最小的数 {
	
	public String PrintMinNumber(int[] numbers){
		int len = numbers.length;
		for(int i = 0;i < len;i ++){
			for(int j = i+1;j < len;j ++){
				String str1 = numbers[i]+""+numbers[j];
				String str2 = numbers[j]+""+numbers[i];
//				System.out.println("str1--"+str1+", str2--"+str2);
				//若str1>str2,则 numbers[i]>numbers[j]
				if(compare1(str1, str2)){
					int tmp = numbers[i];
					System.out.println("tmp:"+tmp);
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
//				System.out.println(numbers[i]+"==="+numbers[j]);
			}
		}
		
		String str = "";
		for (int i = 0; i < numbers.length; i++) {
			str += numbers[i];
		}
		
		return str;
	}
	
	public boolean compare1(String str1, String str2){
		String tmp1 = str1 + "" + str2;
		String tmp2 = str2 + "" + str1;
		boolean res;
		if(tmp1.compareTo(tmp2) >0){
			res = true;
		}else
			res = false;
		return res;
	}
	
	public static void main(String[] args) {
		int[] numbers = {3,32,321};
		把数组排成最小的数 b = new 把数组排成最小的数();
		String res = b.PrintMinNumber(numbers);
		System.out.println(res);
	}

}
