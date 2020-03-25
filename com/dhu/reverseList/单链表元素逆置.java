package 剑指Offfer.com.dhu.reverseList;

public class 单链表元素逆置 {
	public ListNode createList(ListNode L,int n){
		if(L == null)
			L = new ListNode((int)Math.random()*10);
		//L为头指针
		L.setNext(null);
		ListNode node = null;
		node = L.getNext();
		for (int i = 0; i < n; i++) {
			node = new ListNode(n);
			//以下两步为头插法
			node.setNext(L.getNext());
			L.setNext(node);
		}
		
		return L;
	}
	
	public static void illustrate(ListNode head){
		//head为头指针
		ListNode tmp = head;
		while(tmp != null){
			tmp = tmp.getNext();
			System.out.print(tmp.getVal());
			System.out.print("-->");
		}
		
	}
	
	public static void main(String[] args) {
		ListNode head = null;
		单链表元素逆置 d = new 单链表元素逆置();
		ListNode p = d.createList(head, 3);
		System.out.println(p.getVal());
		p.print();
		illustrate(p);
	}

}
