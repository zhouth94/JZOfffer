package 剑指Offfer;

public class 求前n项和 {
	//法一
	public int Sum_Solution(int n){
		int sum = n;
		//&& 逻辑与，也称短路与。只要当前项为假，它就不往后判断了，直接认为表达式为假
		//|| 逻辑或，也称短路或。只要当前项为真，它就不往后判断了，直接认为表达式为真
		boolean flag = (sum>0 && (sum+=Sum_Solution(--n))>0);
		return sum;
	}
	
	//法二
	public int Sum_Solution_2(int n){
		 return ((int)(Math.pow(n, 2) + n)) >> 1;
	}

}
