package 剑指Offfer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author zhou
 *
 */
public class 从尾到头打印链表 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> list = new ArrayList<>();
		if(listNode==null)
			return list;
		ListNode temp = listNode;
		while(temp != null){
			//将指定的元素插入此列表中的指定位置。向右移动当前位于该位置的元素（如果有）以及所有后续元素（将其索引加 1）
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
		从尾到头打印链表 c = new 从尾到头打印链表();
		ArrayList<Integer> resList = c.printListFromTailToHead(l1);
		System.out.println(resList.toString());
	}

}


















