package ��ָOfffer;

import java.util.ArrayList;

/**
 * @author zhou
 *˼·��
����sum=20��1��2��3��4��5��6��7��8��9��10��11��12��13��14��15
1����������ָ�룬��ָ���1��ʼ����ָ���2��ʼ
ѭ����ʼ
2����ͣ�1+2 = 3
3������ж�3С��20����ָ��++��2��Ϊ3�����3+3=6��ѭ��һֱ����ָ��=6����Ϊ21��
4��else if �ж�21����20����ָ��++��1��Ϊ2���ͼ�ȥ��ָ��ֵ����Ϊ21-1=20��
5��else ��������һ����������   ���ٰ���ָ��++����ͣ���ʣ����ϡ�
ѭ������
 */
public class ��ΪS��������������_2 {
	//��������ָ��λ��lVal��rVal
	//sum=20
	// 1,2,3,4,5,6,7,8
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
		ArrayList<ArrayList<Integer>> resList = new ArrayList<ArrayList<Integer>>();
		if(sum <= 0)
			return resList;
		int lVal = 1,rVal = 2;
		int sumVal = lVal + rVal;
		//(���ٰ���������)
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
				//�ּ�����һ�ֿ�ʼѭ��
				rVal ++;
				sumVal += rVal;
			}
			
		}
		return resList;
	}
}
