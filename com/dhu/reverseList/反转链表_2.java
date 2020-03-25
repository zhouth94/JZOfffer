package 剑指Offfer.com.dhu.reverseList;

import com.dhu.addTwoNumbers.ListNode;

/**
 * 反转链表
 * 不申请新的结点空间
 * @author zhou
 *
 */
public class 反转链表_2 {
	
	public ListNode reverseList(ListNode head){
		if(head==null || head.getNext()==null)
			return head;
		ListNode pre = null;
		ListNode p = head;
		ListNode r = p.getNext();
		while(r != null){
			pre = p;
			p = r;
			r = r.getNext();
			p.setNext(pre);
		}
		head.setNext(p);
		return p;
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
		System.out.println();
		反转链表_2 f = new 反转链表_2();
		ListNode res = f.reverseList(node1);
		System.out.println(res.getVal());
		res.print();
	}

}
