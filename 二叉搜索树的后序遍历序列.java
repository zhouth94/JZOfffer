package ��ָOfffer;

public class �����������ĺ���������� {
	//��������ΪArrayList֮��ģ�����ֵ��Ϊnull�ᱨNullPointerException
	
	//�����������ĺ����������
	public boolean VerifySquenceOfBST(int[] sequence){
		if(sequence.length == 0)
			return false;
		return helpVerify(sequence, 0, sequence.length-1);
	}
	
	/**
	 * 
	 * @param sequence	����
	 * @param start	��ʼ���±�
	 * @param end	��ֹ���±꣬�����������ĺ���������У����һ�����Ϊ���ڵ�
	 * @return
	 */
	public boolean helpVerify(int[] sequence,int start, int end){
		if(sequence.length==0)
			return false;
		//һ���Ƕ�����������
		if(start >= end)
			return true;
		//Ѱ�����������ķֽ磬�ҵ�����С�ڸ��ڵ�ֵ��Ԫ�أ����Ƕ�����������Ԫ��
		int value = sequence[end];
		int i;
		for (i = start; i < end; i++) {
			if(sequence[i] > value){
				break;
			}
		}
		//���������Ľ����б���
		for(int j = i;j < end;j ++){
			if(value > sequence[j])
				return false;
		}
		return helpVerify(sequence, start, i-1) && helpVerify(sequence, i, end-1);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{5,9,8,11,15,12,10};
		�����������ĺ���������� e = new �����������ĺ����������();
		boolean res = e.VerifySquenceOfBST(arr);
		System.out.println(res);
	}

}














