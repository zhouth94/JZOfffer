package ��ָOfffer.com.dhu.hasSubtree;

public class �����ӽṹ {
	/**
	 * �������ö��������ж�B�ǲ���A���ӽṹ(���������κ������ӽṹ)
	 * @param root1
	 * @param root2
	 * @return
	 */
	
	//����һ�ø���������ҵ�һ����С�����ڵ�ֵ��ȵĽ�㣬�Ըý��� С�����ڵ��ֵΪ������������ķ���
	public boolean HasSubtree(TreeNode root1,TreeNode root2){
		if(root1==null || root2==null)
			return false;
		
		return HasSubtree(root1.getLeft(), root2) || HasSubtree(root1.getRight(), root2) || ifTree1HasTree2(root1, root2);
	}

	//�������ø��ڵ�ֵ��ͬ�������ж�tree1��tree2�ṹ�Ƿ�һ��
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
		�����ӽṹ s = new �����ӽṹ();
		int[] data = {12,11,34,45,67,89,56,43,22,98};
		TreeNode root = new TreeNode(data[0]);	//�������ڵ�
		
	}
}



















