package 剑指Offfer;

public class 平衡二叉树_2 {
	public boolean IsBalanced_Solution(TreeNode root){
		if(root == null)
			return true;
		if(Math.abs(treeDepth(root.getLeft()) - treeDepth(root.getRight())) > 1)
			return false;
		else
			return IsBalanced_Solution(root.getLeft()) && IsBalanced_Solution(root.getRight());
	}
	
	public int treeDepth(TreeNode root){
		if(root == null)
			return 0;
		return Math.max(treeDepth(root.getLeft()), treeDepth(root.getRight())) + 1;
	}
	
	public static void main(String[] args) {
		平衡二叉树_2 p = new 平衡二叉树_2();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.setLeft(t2);
		t1.setRight(t3);
		t2.setLeft(t4);
		t2.setRight(t5);
		boolean res = p.IsBalanced_Solution(t1);
		System.out.println(res);
	}

}
