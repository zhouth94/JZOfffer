package ��ָOfffer;

public class ��ǰn��� {
	//��һ
	public int Sum_Solution(int n){
		int sum = n;
		//&& �߼��룬Ҳ�ƶ�·�롣ֻҪ��ǰ��Ϊ�٣����Ͳ������ж��ˣ�ֱ����Ϊ���ʽΪ��
		//|| �߼���Ҳ�ƶ�·��ֻҪ��ǰ��Ϊ�棬���Ͳ������ж��ˣ�ֱ����Ϊ���ʽΪ��
		boolean flag = (sum>0 && (sum+=Sum_Solution(--n))>0);
		return sum;
	}
	
	//����
	public int Sum_Solution_2(int n){
		 return ((int)(Math.pow(n, 2) + n)) >> 1;
	}

}
