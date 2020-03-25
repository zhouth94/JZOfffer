package 剑指Offfer;

public class 删除链表中重复的结点 {
	public ListNode deleteDuplication(ListNode pHead){
		if(pHead == null || pHead.getNext() == null)
			return pHead;
		
		ListNode cur = pHead;
		
		//删除链表中相邻结点的值相等的
		if(cur.getVal() == cur.getNext().getVal()){
			ListNode node = cur.getNext();
			while(node!=null && node.getVal()==cur.getVal()){
				node = node.getNext();
			}
			return deleteDuplication(node);
		}else{
//			deleteDuplication(cur.getNext());
			cur.setNext(deleteDuplication(cur.getNext()));
			return cur;
		}
	}
	
	public static void main(String[] args) {
		//1->2->3->3->4->4->5
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(4);
		ListNode l7 = new ListNode(5);
		
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(l6);
		l6.setNext(l7);
		
		l1.print();
		System.out.println();
		删除链表中重复的结点 s = new 删除链表中重复的结点();
		ListNode node = s.deleteDuplication(l1);
		System.out.println(node.getVal());
		l1.print();
		
	}

}
