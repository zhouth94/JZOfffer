package 剑指Offfer;

public class 二叉搜索树的后序遍历序列 {
	//返回类型为ArrayList之类的，返回值设为null会报NullPointerException
	
	//二叉搜索树的后序遍历序列
	public boolean VerifySquenceOfBST(int[] sequence){
		if(sequence.length == 0)
			return false;
		return helpVerify(sequence, 0, sequence.length-1);
	}
	
	/**
	 * 
	 * @param sequence	数组
	 * @param start	起始点下标
	 * @param end	终止点下标，二叉搜索树的后序遍历序列，最后一个结点为根节点
	 * @return
	 */
	public boolean helpVerify(int[] sequence,int start, int end){
		if(sequence.length==0)
			return false;
		//一定是二叉排序树？
		if(start >= end)
			return true;
		//寻找左、右子树的分界，找到所有小于根节点值的元素，它们都是左子树的元素
		int value = sequence[end];
		int i;
		for (i = start; i < end; i++) {
			if(sequence[i] > value){
				break;
			}
		}
		//对右子树的结点进行遍历
		for(int j = i;j < end;j ++){
			if(value > sequence[j])
				return false;
		}
		return helpVerify(sequence, start, i-1) && helpVerify(sequence, i, end-1);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{5,9,8,11,15,12,10};
		二叉搜索树的后序遍历序列 e = new 二叉搜索树的后序遍历序列();
		boolean res = e.VerifySquenceOfBST(arr);
		System.out.println(res);
	}

}














