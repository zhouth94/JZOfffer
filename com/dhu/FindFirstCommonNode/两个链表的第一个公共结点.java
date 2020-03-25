package 剑指Offfer.com.dhu.FindFirstCommonNode;

public class 两个链表的第一个公共结点 {
	/**
	 * 首先要理解什么是公共节点，并不是两个节点的值相同就是公共节点。
	 * 而是在第一链表和第二链表中都存在一个节点，该节点往后的子链表在两个链表中是相同的。
	 * 
	 * 0-1-2-3-4-5-null
		a-b-4-5-null
	 * p1： 0-1-2-3-4-5-null(此时遇到ifelse)-a-b-4-5-null
		p2: a-b-4-5-null(此时遇到ifelse)0-1-2-3-4-5-null
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
		 * 我们比较的是ListNode p1 = pHead1; ListNode p2 = pHead2;
		 * 是两个节点的引用值，而不是节点中存储的数值，在你这种情况下虽然节点存储的值是相同的，
		 * 但是如果对应的节点的引用是不同，两个链表还是没有公共节点的
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
		
		两个链表的第一个公共结点 l = new 两个链表的第一个公共结点();
		ListNode res = l.FindFirstCommonNode(p1, p2);
		if(res == null)
			System.out.println(-1);
		else
			System.out.println(res.getVal());
	}
}
















