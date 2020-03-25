package 剑指Offfer;

public class 矩阵中的路径 {
	//1.根据给定的数组初始化一个标志位数组，初始值为false，表示没走过；true表示已经走过，不能再走第二次
	//2.根据行数和列数遍历数组，先找到一个与str字符串的第一个元素相匹配的矩阵元素，进入judge
	//3.根据i和j先确定一维数组的位置，给定的matrix是一个一维数组
	//4.确定递归终止的条件，赋值false
	//5.若k,表示待判定字符串str的索引走到了最后一位，说明匹配成功
	public boolean hasPath(char[] matrix,int rows,int cols,char[] str){
		//标志位
		boolean[] flag = new boolean[matrix.length];
		for(int i = 0;i < rows;i ++){
			for(int j = 0;j < cols;j ++){
				if(judge(matrix, i, j, rows, cols, flag, str, 0))
					return true;
			}
		}
		return false;
		
	}

	//k:字符串索引初始值为0，即先判断字符串的第一位 
	private boolean judge(char[] matrix, int i, int j, int rows, int cols, boolean[] flag, char[] str, int k) {
		//先根据i和j计算匹配的第一个元素，转为一位数组matrix的位置下标
		int index = i * cols + j;
		//递归终止条件
		if(i<0 || j<0 || i>=rows || j>=cols || matrix[index]!=str[k] || flag[index]!=false){
			return false;
		}
		//若k已到达str末尾，说明之前的匹配成功
		if(k == str.length-1){
			return true;
		}
		//走过的位置置为true
		flag[index] = true;
		//回溯
		if(judge(matrix, i-1, j, rows, cols, flag, str, k) || 
			judge(matrix, i, j+1, rows, cols, flag, str, k) ||
			judge(matrix, i+1, j, rows, cols, flag, str, k) ||
			judge(matrix, i, j-1, rows, cols, flag, str, k)){
			return true;
			
		}
		//走到这，说明这一条路不通，还原，再试其他的路径
		flag[index] = false;
				
		return false;
	}

}


















