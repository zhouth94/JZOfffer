package ��ָOfffer.com.dhu.reverseList;

public class ������Ԫ������ {
	public ListNode createList(ListNode L,int n){
		if(L == null)
			L = new ListNode((int)Math.random()*10);
		//LΪͷָ��
		L.setNext(null);
		ListNode node = null;
		node = L.getNext();
		for (int i = 0; i < n; i++) {
			node = new ListNode(n);
			//��������Ϊͷ�巨
			node.setNext(L.getNext());
			L.setNext(node);
		}
		
		return L;
	}
	
	public static void illustrate(ListNode head){
		//headΪͷָ��
		ListNode tmp = head;
		while(tmp != null){
			tmp = tmp.getNext();
			System.out.print(tmp.getVal());
			System.out.print("-->");
		}
		
	}
	
	public static void main(String[] args) {
		ListNode head = null;
		������Ԫ������ d = new ������Ԫ������();
		ListNode p = d.createList(head, 3);
		System.out.println(p.getVal());
		p.print();
		illustrate(p);
	}

}
