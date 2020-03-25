package 剑指Offfer;

public class 二叉树的镜像 {
	public void Mirror(TreeNode root){
		if(root == null)
			return ;
		//交换左右子树的结点，递归调用
		TreeNode tmp = root.getRight();
		root.setRight(root.getLeft());
		root.setLeft(tmp);
		Mirror(root.getLeft());
		Mirror(root.getRight());
		
	}

}
