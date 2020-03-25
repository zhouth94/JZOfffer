package ��ָOfffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class �ַ��������� {
	private ArrayList<String> list = new ArrayList<>();
	private StringBuilder sb = new StringBuilder();
	private TreeSet<String> set = new TreeSet<>();
	private boolean[] used;
	
	public ArrayList<String> Permutation(String str){
		if(str==null || str.equals(""))
			return list;
		int length = str.length();
		char[] chArray = str.toCharArray();
		Arrays.sort(chArray);
		//Ĭ��ֵΪfalse
		used = new boolean[length];
		stringSort(chArray, 0);
		list.addAll(set);
		return list;
	}

	private void stringSort(char[] chArray, int index) {
		if(index == chArray.length)
			set.add(sb.toString());
		for (int i = 0; i < chArray.length; i++) {
			if(!used[i]){
				sb.append(chArray[i]);
				used[i] = true;
				stringSort(chArray, index+1);
				//״̬����
				sb.deleteCharAt(sb.length()-1);
				used[i] = false;
			}
		}
		
	}
	
	public static void main(String[] args) {
		�ַ��������� z = new �ַ���������();
		ArrayList<String> res = z.Permutation("abc");
		System.out.println(res.toString());
	}

}
