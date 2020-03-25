package 剑指Offfer;

public class 链表中环的入口结点 {
	public ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead==null || pHead.getNext()==null)
			return null;
		ListNode fast = pHead;
		ListNode slow = pHead;
		while(fast!=null && fast.getNext()!=null){
			fast.setNext(fast.getNext().getNext());
			slow.setNext(slow.getNext());
			if(fast == slow){
				break;
			}
		}
		if(fast!=null || fast.getNext()!=null){
			fast = pHead;
			while(fast != slow){
				fast.setNext(fast);
			}
		}
		return null;
		
		
	}
}
