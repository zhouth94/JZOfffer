package 剑指Offfer;

import java.util.ArrayList;

/**
 * @author zhou
 *思路：
输入sum=20（1，2，3，4，5，6，7，8，9，10，11，12，13，14，15
1，定义两个指针，左指针从1开始，右指针从2开始
循环开始
2，求和（1+2 = 3
3，如果判断3小于20，右指针++，2变为3，求和3+3=6。循环一直到右指针=6，和为21。
4，else if 判断21大于20，左指针++，1变为2，和减去左指针值，和为21-1=20。
5，else 和与输入一样，存数。   【再把右指针++，求和，求剩余组合】
循环结束
 */
public class 和为S的连续正数序列_2 {
	//设置两个指针位，lVal和rVal
	//sum=20
	// 1,2,3,4,5,6,7,8
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
		ArrayList<ArrayList<Integer>> resList = new ArrayList<ArrayList<Integer>>();
		if(sum <= 0)
			return resList;
		int lVal = 1,rVal = 2;
		int sumVal = lVal + rVal;
		//(至少包括两个数)
		while(rVal < sum){
			if(sumVal < sum){
				rVal ++;
				sumVal += rVal;
			}else if(sumVal > sum){
				sumVal -= lVal;
				lVal ++;
			}else{// ==
				ArrayList<Integer> partList = new ArrayList<>();
				for(int i = lVal;i <= rVal;i ++){
					partList.add(i);
				}
				resList.add(partList);
//				partList.clear();
				//又继续新一轮开始循环
				rVal ++;
				sumVal += rVal;
			}
			
		}
		return resList;
	}
}
