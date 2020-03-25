package ��ָOfffer.com.dhu.FindFirstCommonNode;

public class ��������ĵ�һ��������� {
	/**
	 * ����Ҫ���ʲô�ǹ����ڵ㣬�����������ڵ��ֵ��ͬ���ǹ����ڵ㡣
	 * �����ڵ�һ����͵ڶ������ж�����һ���ڵ㣬�ýڵ����������������������������ͬ�ġ�
	 * 
	 * 0-1-2-3-4-5-null
		a-b-4-5-null
	 * p1�� 0-1-2-3-4-5-null(��ʱ����ifelse)-a-b-4-5-null
		p2: a-b-4-5-null(��ʱ����ifelse)0-1-2-3-4-5-null
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
		if(pHead1==null || pHead2==null)
			return null;
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while(p1 != p2){
			p1 = p1.getNext();
			p2 = p2.getNext();
			if(p1 != p2){
				if(p1 == null)
					p1.setNext(pHead2);
				if(p2 == null)
					p2.setNext(pHead1);
			}
		}
		return p1;
	}

	public static void main(String[] args) {
		/**
		 * ���ǱȽϵ���ListNode p1 = pHead1; ListNode p2 = pHead2;
		 * �������ڵ������ֵ�������ǽڵ��д洢����ֵ�����������������Ȼ�ڵ�洢��ֵ����ͬ�ģ�
		 * ���������Ӧ�Ľڵ�������ǲ�ͬ������������û�й����ڵ��
		 */
		ListNode p1 = new ListNode(1);
		ListNode p1_1 = new ListNode(3);
		ListNode p1_2 = new ListNode(4);
		p1.setNext(p1_1);
		p1_1.setNext(p1_2);
		
		ListNode p2 = new ListNode(1);
		ListNode p2_1 = new ListNode(2);
		ListNode p2_2 = new ListNode(3);
		p2.setNext(p2_1);
		p2_1.setNext(p2_2);
		
		p1.print();
		p2.print();
		
		��������ĵ�һ��������� l = new ��������ĵ�һ���������();
		ListNode res = l.FindFirstCommonNode(p1, p2);
		if(res == null)
			System.out.println(-1);
		else
			System.out.println(res.getVal());
	}
}
















