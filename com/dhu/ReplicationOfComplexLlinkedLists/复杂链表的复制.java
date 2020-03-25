package 剑指Offfer.com.dhu.ReplicationOfComplexLlinkedLists;

import java.util.HashMap;
import java.util.Map;

public class 复杂链表的复制 {
	public RandomListNode clone(RandomListNode pHead){
		if(pHead == null)
			return null;
		RandomListNode p1 = pHead;
		RandomListNode p2 = pHead;
		//1.使用HashMap建立新旧链表结点的对应的结点关系
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		while(p1 != null){
			map.put(p1, new RandomListNode(p1.getLabel()));
			p1 = p1.getNext();
		}
		
		//2.迭代旧链表，从而在hashmap中更新新链表的next指针和random域
		while(p2 != null){
			if(p2.getNext() != null){
				map.get(p2).setNext(map.get(p2.getNext())); 
			}else {
				map.get(p2).setNext(null);
			}
			map.get(p2).setRandom(map.get(p2.getRandom()));
			p2 = p2.getNext();
		}
		
		return map.get(pHead);
		
	}

}
