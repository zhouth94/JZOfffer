package 剑指Offfer.com.dhu.TreeDepth;

import java.util.ArrayList;

public class 二叉树的深度_2 {
	//层次遍历
	public int TreeDepth(TreeNode root){
		if(root == null)
			return 0;
		ArrayList<TreeNode> node = new ArrayList<>();
		node.add(root); //将树的结点全部添加到level链表中
		int count = 0;
		while(node.size() > 0){
			count ++;
			ArrayList<TreeNode> newNode = new ArrayList<>();
			for(int i = 0;i < node.size();i ++){
				if(node.get(i).getLeft() != null){
					newNode.add(node.get(i).getLeft());
				}
				if(node.get(i).getRight() != null){
					newNode.add(node.get(i).getRight());
				}
			}
			node = newNode;
		}
		return count;
	}
	
	public static void main(String[] args) {
		二叉树的深度_2 e = new 二叉树的深度_2();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.setLeft(t2);
		t1.setRight(t3);
		t2.setLeft(t4);
		t2.setRight(t5);
		int res = e.TreeDepth(t1);
		System.out.println(res);
	}

}
