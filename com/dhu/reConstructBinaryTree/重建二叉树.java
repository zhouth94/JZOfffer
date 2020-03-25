package ��ָOfffer.com.dhu.reConstructBinaryTree;

import java.util.Arrays;

public class �ؽ������� {
	//pre:ǰ��	in:����
	public TreeNode reConstructBinaryTree(int[] pre,int[] in){
		if(pre.length==0 || in.length==0)
			return null;
		//���ڵ�Ϊǰ�����еĵ�һ�����
		TreeNode root = new TreeNode(pre[0]);
		TreeNode left = root.getLeft();
		TreeNode right = root.getRight();
		//�����������в��Ҹ��ڵ��λ��
		for (int i = 0; i < in.length; i++) {
			//�������������ҵ����ڵ㣬ʹ�õݹ飬������������
			if(pre[0] == in[i]){
				//������
				//Arrays.copyOfRangeΪ����ҿ���
				left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),Arrays.copyOfRange(in, 0, i));
				//������
				right  = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
				break;
			}
		}
		
		return root;
	}

	

}
