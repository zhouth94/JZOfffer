package 剑指Offfer.com.dhu.reConstructBinaryTree;

import java.util.Arrays;

public class 重建二叉树 {
	//pre:前序	in:中序
	public TreeNode reConstructBinaryTree(int[] pre,int[] in){
		if(pre.length==0 || in.length==0)
			return null;
		//根节点为前序序列的第一个结点
		TreeNode root = new TreeNode(pre[0]);
		TreeNode left = root.getLeft();
		TreeNode right = root.getRight();
		//在中序序列中查找根节点的位置
		for (int i = 0; i < in.length; i++) {
			//在中序序列中找到根节点，使用递归，查找左、右子树
			if(pre[0] == in[i]){
				//左子树
				//Arrays.copyOfRange为左闭右开，
				left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),Arrays.copyOfRange(in, 0, i));
				//右子树
				right  = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
				break;
			}
		}
		
		return root;
	}

	

}
