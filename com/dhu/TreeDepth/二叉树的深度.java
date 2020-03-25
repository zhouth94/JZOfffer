package 剑指Offfer.com.dhu.TreeDepth;

public class 二叉树的深度 {
	public int TreeDepth(TreeNode root){
		if(root == null)
			return 0;
//		TreeNode p = root;
		if(root!=null){
			int ldepth = TreeDepth(root.getLeft());
			int rdepth = TreeDepth(root.getRight());
			return Math.max(ldepth, rdepth)+1;
		}else
			return 0;
	}
	
	public static void main(String[] args) {
		二叉树的深度 e = new 二叉树的深度();
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
