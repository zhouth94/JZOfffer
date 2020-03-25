package 剑指Offfer;

public class 二维数组的查找_2从左下找 {
	public boolean Find(int target,int [][] array){
		int rows = array.length;
		if(rows == 0)
			return false;
		int cols = array[0].length;
		if(cols == 0)
			return false;
		// 从数组的左下位置开始比较
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
