package 剑指Offfer.com.dhu.reverseList;

import com.dhu.addTwoNumbers.ListNode;

public class 反转链表 {
	public ListNode reverseList(ListNode head){
		if(head==null || head.getNext()==null)
			return head;
		ListNode pre = null;
		ListNode next = null;
		while(head != null){
			//1.先保存当前结点head的下一个结点
			next = head.getNext();
			//2.再将当前结点指向前一个位置
			head.setNext(pre);
			//pre 和  head 分别往后移动
			pre = head;
			head = next;
		}
		
		return pre;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		node1.setNext(node2);
		node2.setNext(node3);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(8);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node1.print();
		反转链表 f = new 反转链表();
		ListNode res = f.reverseList(node1);
		System.out.println(res.getVal());
		res.print();
	}

}
