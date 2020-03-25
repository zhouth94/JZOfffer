package 剑指Offfer;

public class 删除链表中重复的结点_3 {
	public ListNode deleteDuplication(ListNode pHead){
		if(pHead==null || pHead.getNext()==null)
			return pHead;
		
		//自定义一个投结点
		ListNode head = new ListNode(Integer.MIN_VALUE);
		head.setNext(pHead);
		ListNode cur = head;
		ListNode node = head.getNext();
		
		while(node != null){
			if(node.getNext()!=null && node.getVal()==node.getNext().getVal()){
				while(node.getNext()!=null && node.getVal()==node.getNext().getVal()){
					node = node.getNext();
				}
				node = node.getNext();
				cur.setNext(node);
			}else{
				cur = node;
				node = node.getNext();
			}
		}
		return head.getNext();
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
		删除链表中重复的结点_3 s = new 删除链表中重复的结点_3();
		ListNode node = s.deleteDuplication(l1);
		System.out.println(node.getVal());
		l1.print();
		
	}

}
