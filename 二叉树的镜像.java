package ��ָOfffer;

public class �������ľ��� {
	public void Mirror(TreeNode root){
		if(root == null)
			return ;
		//�������������Ľ�㣬�ݹ����
		TreeNode tmp = root.getRight();
		root.setRight(root.getLeft());
		root.setLeft(tmp);
		Mirror(root.getLeft());
		Mirror(root.getRight());
		
	}

}
