package ��ָOfffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class �������´�ӡ������ {
	//��������ΪArrayList֮��ģ�����ֵ��Ϊnull�ᱨNullPointerException
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		ArrayList<Integer> res = new ArrayList<>();
		if(root == null)
			return res;
		//LinkedListʵ����Queue�ӿ�
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//���Խ���������������� ���ڵ�ʹ���һ����
		queue.offer(root);
		while(!queue.isEmpty()){
			//��ͷԪ�س���
			TreeNode node = queue.poll();
			res.add(node.getVal());
			if(node.getLeft() != null){
				queue.offer(node.getLeft());
			}
			if(node.getRight() != null){
				queue.offer(node.getRight());
			}
		}
		return res;
	}

}
