package 剑指Offfer.com.dhu.FindFirstCommonNode;

public class 两个链表的第一个公共结点_2 {
	/**
	 * 链表概念
	 * 当一个节点相等后,说明这个节点后面的节点都重合了,肯定也是相等的,这就是为什么只要求第一个重合的节点了
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
