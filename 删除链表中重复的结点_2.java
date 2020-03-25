package 剑指Offfer;

import java.util.HashSet;

public class 删除链表中重复的结点_2 {
	public ListNode deleteDuplication(ListNode pHead){
		if(pHead==null || pHead.getNext()==null)
			return pHead;
		
		ListNode cur = pHead;
		ListNode node = cur.getNext();
		
		//先将重复的结点放入set集合
		HashSet<Integer> set = new HashSet<>();
		while(node!=null){
			if(cur.getVal() ==  node.getVal()){
				set.add(node.getVal());
			}
//			cur.setNext(node);
//			node.setNext(node.getNext());
			cur = node;
			node = node.getNext();
		}
		
		//删除头结点
		while(pHead!=null && set.contains(pHead.getVal())){
//			pHead.setNext(pHead.getNext());
			pHead = pHead.getNext();
		}
		if(pHead == null)
			return pHead;
		
		cur = pHead;
		node = cur.getNext();
		
		//删除中间的其他结点
		while(node != null){
			if(set.contains(node.getVal())){
				cur.setNext(node.getNext());
			}else{
//				cur.setNext(node);
				cur = node;
			}
			node = node.getNext();
			
			//这句会导致死循环
//			node.setNext(node.getNext());
		}
		
		return pHead;
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
		删除链表中重复的结点_2 s = new 删除链表中重复的结点_2();
		ListNode node = s.deleteDuplication(l1);
		System.out.println(node.getVal());
		l1.print();
		
	}

}
