package ½£Ö¸Offfer;

public class ListNode {
	private int val;
	private ListNode next = null;
	
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

	/**
	 * ´òÓ¡Á´±í
	 * @param head
	 */
	public void print(){
		System.out.print(this.val);
		if(this.next != null){
			System.out.print("-->");
			this.next.print();
		}
	}
	
	
	
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
	
	

}
