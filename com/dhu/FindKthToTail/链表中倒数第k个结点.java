package ��ָOfffer.com.dhu.FindKthToTail;

import java.util.Scanner;

import com.dhu.addTwoNumbers.ListNode;

public class �����е�����k����� {
	public ListNode FindKthToTail(ListNode head,int k){
		if(head==null)
			return null;
		int totalNum = 0;
		if(head != null)
			totalNum ++;
		ListNode p = head;
		ListNode currNode = head.getNext();
		//ͳ���ܵĽ����
		while(currNode != null){
			totalNum ++;
			currNode = currNode.getNext();
		}
		if(k > totalNum)
			return null;
		//������k����㣬��˳����totalNum-k+1��
		for (int i = 1; i <= totalNum-k; i++) {
			p = p.getNext();
		}
		
		return p;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		node1.setNext(node2);
		node2.setNext(node3);
		ListNode node4 = new ListNode(5);
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node1.print();
		�����е�����k����� l = new �����е�����k�����();
		System.out.print("���뵹����k�����:");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ListNode res = l.FindKthToTail(node1, k);
		System.out.println(res.getVal());
	}

}















