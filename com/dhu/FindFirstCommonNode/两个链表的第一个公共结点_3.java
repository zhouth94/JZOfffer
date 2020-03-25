package 剑指Offfer.com.dhu.FindFirstCommonNode;

import java.util.HashMap;

public class 两个链表的第一个公共结点_3 {
	//运用HashMap特性
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
		ListNode current1 = pHead1;
		ListNode current2 = pHead2;
		
		HashMap<ListNode,Integer> map = new HashMap<>();
		while(current1 != null){
			map.put(current1, 0);
			current1 = current1.getNext();
		}
		while(current2 != null){
			if(map.containsKey(current2)){
				return current2;
			}
			current2 = current2.getNext();
		}
		return null;
	}

}
