package ��ָOfffer;

public class �����е�·�� {
	//1.���ݸ����������ʼ��һ����־λ���飬��ʼֵΪfalse����ʾû�߹���true��ʾ�Ѿ��߹����������ߵڶ���
	//2.���������������������飬���ҵ�һ����str�ַ����ĵ�һ��Ԫ����ƥ��ľ���Ԫ�أ�����judge
	//3.����i��j��ȷ��һά�����λ�ã�������matrix��һ��һά����
	//4.ȷ���ݹ���ֹ����������ֵfalse
	//5.��k,��ʾ���ж��ַ���str�������ߵ������һλ��˵��ƥ��ɹ�
	public boolean hasPath(char[] matrix,int rows,int cols,char[] str){
		//��־λ
		boolean[] flag = new boolean[matrix.length];
		for(int i = 0;i < rows;i ++){
			for(int j = 0;j < cols;j ++){
				if(judge(matrix, i, j, rows, cols, flag, str, 0))
					return true;
			}
		}
		return false;
		
	}

	//k:�ַ���������ʼֵΪ0�������ж��ַ����ĵ�һλ 
	private boolean judge(char[] matrix, int i, int j, int rows, int cols, boolean[] flag, char[] str, int k) {
		//�ȸ���i��j����ƥ��ĵ�һ��Ԫ�أ�תΪһλ����matrix��λ���±�
		int index = i * cols + j;
		//�ݹ���ֹ����
		if(i<0 || j<0 || i>=rows || j>=cols || matrix[index]!=str[k] || flag[index]!=false){
			return false;
		}
		//��k�ѵ���strĩβ��˵��֮ǰ��ƥ��ɹ�
		if(k == str.length-1){
			return true;
		}
		//�߹���λ����Ϊtrue
		flag[index] = true;
		//����
		if(judge(matrix, i-1, j, rows, cols, flag, str, k) || 
			judge(matrix, i, j+1, rows, cols, flag, str, k) ||
			judge(matrix, i+1, j, rows, cols, flag, str, k) ||
			judge(matrix, i, j-1, rows, cols, flag, str, k)){
			return true;
			
		}
		//�ߵ��⣬˵����һ��·��ͨ����ԭ������������·��
		flag[index] = false;
				
		return false;
	}

}


















