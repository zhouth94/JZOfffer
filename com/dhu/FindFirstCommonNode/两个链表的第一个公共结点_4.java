package ��ָOfffer.com.dhu.FindFirstCommonNode;

public class ��������ĵ�һ���������_4 {
	public ListNode FindFirstCommonNode(ListNode pHead1,ListNode pHead2){
		if(pHead1==null || pHead2==null)
			return null;
		
		ListNode curr1 = pHead1;
		ListNode curr2 = pHead2;
		
		int length1 = getLength(pHead1);
		int length2 = getLength(pHead2);
		//����1��������2
		if(length1 - length2 >= 0){
			int len = length1 - length2;
			while(len > 0){
				curr1 = curr1.getNext();
				len --;
			}
		}
		//����2��������1
		if(length2 - length1 >= 0){
			int len = length2 - length1;
			while(len > 0){
				curr2 = curr2.getNext();
				len --;
			}
		}
		//����������ȵĳ��Ƚ��бȽ�
		while(curr1!=null && curr2!=null){
			if(curr1 == curr2){
				return curr1;
			}
			curr1=curr1.getNext();
            curr2=curr2.getNext();
		}
		return null;
		
	}

	private int getLength(ListNode pHead) {
		if(pHead == null)
			return 0;
		int length = 0;
		ListNode current = pHead;
		while(current != null){
			length ++;
			current = current.getNext();
		}
		return length;
	}

}
