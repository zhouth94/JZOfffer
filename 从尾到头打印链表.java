package ��ָOfffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һ�������������β��ͷ��˳�򷵻�һ��ArrayList��
 * @author zhou
 *
 */
public class ��β��ͷ��ӡ���� {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> list = new ArrayList<>();
		if(listNode==null)
			return list;
		ListNode temp = listNode;
		while(temp != null){
			//��ָ����Ԫ�ز�����б��е�ָ��λ�á������ƶ���ǰλ�ڸ�λ�õ�Ԫ�أ�����У��Լ����к���Ԫ�أ����������� 1��
			list.add(0, temp.getVal());
			temp = temp.getNext();
		}
		
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListNode l1 = new ListNode(6);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(2);
		ListNode l6 = new ListNode(3);
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		l4.setNext(l5);
		l5.setNext(l6);
		
		l1.print();
		//l1.print(l1);
		��β��ͷ��ӡ���� c = new ��β��ͷ��ӡ����();
		ArrayList<Integer> resList = c.printListFromTailToHead(l1);
		System.out.println(resList.toString());
	}

}


















