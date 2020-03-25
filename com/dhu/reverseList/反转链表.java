package ��ָOfffer.com.dhu.reverseList;

import com.dhu.addTwoNumbers.ListNode;

public class ��ת���� {
	public ListNode reverseList(ListNode head){
		if(head==null || head.getNext()==null)
			return head;
		ListNode pre = null;
		ListNode next = null;
		while(head != null){
			//1.�ȱ��浱ǰ���head����һ�����
			next = head.getNext();
			//2.�ٽ���ǰ���ָ��ǰһ��λ��
			head.setNext(pre);
			//pre ��  head �ֱ������ƶ�
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
		��ת���� f = new ��ת����();
		ListNode res = f.reverseList(node1);
		System.out.println(res.getVal());
		res.print();
	}

}
