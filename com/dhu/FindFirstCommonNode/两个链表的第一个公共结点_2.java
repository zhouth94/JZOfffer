package ��ָOfffer.com.dhu.FindFirstCommonNode;

public class ��������ĵ�һ���������_2 {
	/**
	 * �������
	 * ��һ���ڵ���Ⱥ�,˵������ڵ����Ľڵ㶼�غ���,�϶�Ҳ����ȵ�,�����ΪʲôֻҪ���һ���غϵĽڵ���
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
		if(pHead1==null || pHead2==null)
			return null;
		ListNode p1 = pHead1;
		while(p1 != null){
			ListNode p2 = pHead2;
			while(p2 != null){
				if(p1 == p2){
					return p1;
				}else
					p2 = p2.getNext();
			}
			p1 = p1.getNext();
		}
		return null;
	}

}
