package ��ָOfffer.com.dhu.ReplicationOfComplexLlinkedLists;

import java.util.HashMap;
import java.util.Map;

public class ��������ĸ��� {
	public RandomListNode clone(RandomListNode pHead){
		if(pHead == null)
			return null;
		RandomListNode p1 = pHead;
		RandomListNode p2 = pHead;
		//1.ʹ��HashMap�����¾�������Ķ�Ӧ�Ľ���ϵ
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		while(p1 != null){
			map.put(p1, new RandomListNode(p1.getLabel()));
			p1 = p1.getNext();
		}
		
		//2.�����������Ӷ���hashmap�и����������nextָ���random��
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
