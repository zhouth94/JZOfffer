package ��ָOfffer;

public class ��ά����Ĳ���_2�������� {
	public boolean Find(int target,int [][] array){
		int rows = array.length;
		if(rows == 0)
			return false;
		int cols = array[0].length;
		if(cols == 0)
			return false;
		// �����������λ�ÿ�ʼ�Ƚ�
		int row = rows - 1;
		int col = 0;
		while(row>=0 && col<cols){
			if(array[row][col] > target){
				row --;
			}else if(array[row][col] < target){
				col ++;
			}else
				return true;
		}
		
		return false;
	}
}
