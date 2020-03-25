package 剑指Offfer.com.dhu.merge;

public class ListNode {
	private int val;
	private ListNode next;
	
	public ListNode(){
		
	}
	
	public ListNode(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public void print(){
		System.out.print(this.val);
		if(this.next!=null){
			System.out.print("-->");
			System.out.print(this.next.val);
		}
	}
	
	public void illustrate(ListNode head){
		//head为头指针
		ListNode tmp = head;
		while(tmp != null){
			tmp = tmp.getNext();
			System.out.print(tmp.val);
			System.out.print("-->");
		}
		
	}
	

}
















