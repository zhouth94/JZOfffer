package ��ָOfffer;

public class ���üӼ��˳����ӷ� {
	/**
	 * ��һ������Ӹ�λ��ֵ�������λ��������ÿλ��Ӿ��൱�ڸ�λ���������� ^
	 * �ڶ����������λֵ���൱�ڸ�λ�����������������һλ�� ( & )<<1
	 * �������ظ����������� ��λ��� �������λֵ����λֵΪ0������ѭ����
	 * @param num1
	 * @param nums2
	 * @return
	 */
	public int Add(int num1,int num2){
		int res = 0,carry = 0;
		do {
			//��ӣ�Ҳ�����߼����
			res = num1 ^ num2;
			//�����ƽ�λ��Ҳ����( & )<<1
			carry = (num1 & num2) << 1;
			num1 = res;
			num2 = carry;
		} while (carry != 0);
		return res;
		
	}
	
	public static void main(String[] args) {
		���üӼ��˳����ӷ� b = new ���üӼ��˳����ӷ�();
		int res = b.Add(5, 7);
		System.out.println(res);
	}
}
