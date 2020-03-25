package 剑指Offfer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 从上往下打印二叉树 {
	//返回类型为ArrayList之类的，返回值设为null会报NullPointerException
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		ArrayList<Integer> res = new ArrayList<>();
		if(root == null)
			return res;
		//LinkedList实现了Queue接口
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//可以将整棵树插入队列吗？ 根节点就代表一棵树
		queue.offer(root);
		while(!queue.isEmpty()){
			//队头元素出队
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
