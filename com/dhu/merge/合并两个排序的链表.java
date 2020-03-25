package 剑指Offfer.com.dhu.merge;

import com.dhu.addTwoNumbers.ListNode;

public class 合并两个排序的链表 {
	//两个单调递增的链表
	//list1与list2都是结点元素
	public ListNode merge(ListNode list1,ListNode list2){
		if(list1==null)
			return list2;
		if(list2==null)
			return list1;
//		ListNode L1 = list1.getNext();	这种写法错误
//		ListNode L2 = list2.getNext();
//		ListNode L1 = list1;
//		ListNode L2 = list2;
		//如何创建一个新的链表
		ListNode cur = new ListNode(-1);
		ListNode head = cur;
		while(list1!=null && list2!=null){
			if(list1.getVal() > list2.getVal()){
				cur.setNext(list2);
				list2 = list2.getNext();
			}else{
				cur.setNext(list1);
				list1 = list1.getNext();
			}
			//一轮过后，cur需往后移动
			cur = cur.getNext();
		}
		if(list1!=null)
			cur.setNext(list1);
		if(list2!=null)
			cur.setNext(list2);
		
		return head;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		node1.setNext(node2);
		node2.setNext(node3);
		ListNode node4 = new ListNode(9);
		ListNode node5 = new ListNode(11);
		ListNode node6 = new ListNode(13);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node1.print();
		System.out.println();
		ListNode node_1 = new ListNode(2);
		ListNode node_2 = new ListNode(8);
		ListNode node_3 = new ListNode(11);
		node_1.setNext(node_2);
		node_2.setNext(node_3);
		ListNode node_4 = new ListNode(13);
		ListNode node_5 = new ListNode(16);
		node_3.setNext(node_4);
		node_4.setNext(node_5);
		node_1.print();
		System.out.println();
		合并两个排序的链表 h = new 合并两个排序的链表();
		ListNode res = h.merge(node1, node_1);
		res.print();
		System.out.println(res);
	}

}


















