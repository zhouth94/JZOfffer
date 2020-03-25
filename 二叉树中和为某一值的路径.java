package 剑指Offfer;

import java.util.ArrayList;

import org.junit.Test;

public class 二叉树中和为某一值的路径 {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
		
		if(root == null)
			return result;
		list.add(root.getVal());
		target -= root.getVal();
		if(target == 0 && (root.getLeft()==null&&root.getRight()==null)){
			//注意:result.add(list)是把list的引用地址添加到result
			//而list是用来存放路径的地方，需要复制一份后加入到result中
//			result.add(list);
			
			result.add(new ArrayList<Integer>(list));
//			result.add(list);
		}
			
		ArrayList<ArrayList<Integer>> result1 = FindPath(root.getLeft(), target);
		ArrayList<ArrayList<Integer>> result2 = FindPath(root.getRight(), target);
		
		list.remove(list.size()-1);
		return result;
		
	}
	
	@Test
	public void test(){
		TreeNode t1 = new TreeNode(10);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(12);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(7);
		TreeNode t6 = new TreeNode(3);
		t1.setRight(t2);
		t1.setLeft(t3);
		t2.setLeft(t4);
		t2.setRight(t5);
		t4.setLeft(t6);
		ArrayList<ArrayList<Integer>> res = FindPath(t1, 22);
		for(ArrayList<Integer> path:res){
			System.out.println(path);
		}
	}

}
