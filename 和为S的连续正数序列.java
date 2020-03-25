package 剑指Offfer;

import java.util.ArrayList;

public class 和为S的连续正数序列 {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
		ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
		for(int i =1;i < sum;i ++){
			int tmp = 0;
			int j = i;
			while(tmp < sum){
				tmp += j;
				j ++;
			}
			if(tmp == sum){
				ArrayList<Integer> list = new ArrayList<>();
				for(int k = i;k < j;k ++){
					list.add(k);
				}
				resultList.add(list);
			}
		}
		return resultList;
	}
	
	public static void main(String[] args) {
		和为S的连续正数序列 h = new 和为S的连续正数序列();
		ArrayList<ArrayList<Integer>> resList = h.FindContinuousSequence(100);
		for(ArrayList<Integer> rList: resList){
			System.out.println(rList);
		}
	}
}


