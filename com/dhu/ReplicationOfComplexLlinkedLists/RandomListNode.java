package ½£Ö¸Offfer.com.dhu.ReplicationOfComplexLlinkedLists;

public class RandomListNode {
	private int label;
	private RandomListNode random = null;
	private RandomListNode next = null;
	
	public RandomListNode(int label) {
		this.label = label;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	public RandomListNode getRandom() {
		return random;
	}

	public void setRandom(RandomListNode random) {
		this.random = random;
	}

	public RandomListNode getNext() {
		return next;
	}

	public void setNext(RandomListNode next) {
		this.next = next;
	}
	

}
