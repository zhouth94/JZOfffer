package 剑指Offfer.com.dhu.hasSubtree;

public class 树的子结构 {
	/**
	 * 输入两棵二叉树，判断B是不是A的子结构(空树不是任何树的子结构)
	 * @param root1
	 * @param root2
	 * @return
	 */
	
	//遍历一棵更大的树，找到一个和小树根节点值相等的结点，以该结点和 小树根节点的值为参数调用下面的方法
	public boolean HasSubtree(TreeNode root1,TreeNode root2){
		if(root1==null || root2==null)
			return false;
		
		return HasSubtree(root1.getLeft(), root2) || HasSubtree(root1.getRight(), root2) || ifTree1HasTree2(root1, root2);
	}

	//传入两棵根节点值相同的树，判断tree1和tree2结构是否一样
	public boolean ifTree1HasTree2(TreeNode tree1,TreeNode tree2){
		if(tree1 == null)
			return false;
		if(tree2 == null)
			return false;
		if(tree1.getVal() != tree2.getVal())
			return false;
		
		return ifTree1HasTree2(tree1.getLeft(), tree2.getLeft()) && ifTree1HasTree2(tree1.getRight(), tree2.getRight());
	}
	
	public static void main(String[] args) {
		树的子结构 s = new 树的子结构();
		int[] data = {12,11,34,45,67,89,56,43,22,98};
		TreeNode root = new TreeNode(data[0]);	//创建根节点
		
	}
}



















