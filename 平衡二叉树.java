package ��ָOfffer;


public class ƽ������� {
	//ƽ�����������������Ҳ�ֱ���ƽ���������ƽ����������������ĸ߶Ȳ����1
	public boolean IsBalanced_Solution(TreeNode root){
		if(root == null)
			return true;
		int left = treeDepth(root.getLeft());
		int right = treeDepth(root.getRight());
		int diff = left - right;
		if(diff > 1 || diff < -1){
			return false;
		}
		return IsBalanced_Solution(root.getLeft()) && IsBalanced_Solution(root.getRight());
	}
	
	public int treeDepth(TreeNode root){
		if(root == null)
			return 0;
		int ldepth = treeDepth(root.getLeft());
		int rdepth = treeDepth(root.getRight());
		return (ldepth > rdepth)? (ldepth+1) : (rdepth+1);
	}
	
	public static void main(String[] args) {
		ƽ������� p = new ƽ�������();
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
