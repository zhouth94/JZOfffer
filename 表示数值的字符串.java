package ��ָOfffer;

public class ��ʾ��ֵ���ַ��� {
	public boolean isNumeric(char[] str){
		boolean point = false,exp = false;
		for(int i = 0;i < str.length;i ++){
			if(str[i]=='+' || str[i]=='-'){
				//+-�ź���ض�Ϊ���ֻ����Ϊ. ��-.123 = -0.123��
				if(i+1==str.length || !(str[i+1]>='0'&&str[i+1]<='9' || str[i+1]=='.')){
					return false;
				}
				// +-��ֻ�����ڵ�һλ��eE�ĺ�һλ
				if(!(i==0 || str[i-1]=='e' || str[i-1]=='E')){
					return false;
				}
			}// .����ض�Ϊ���� ��Ϊ���һλ��233. = 233.0��
			else if(str[i]=='.'){
				if(point==true || exp==true || !(str.length>(i+1) && str[i+1]>='0' && str[i+1]<='9')){
					return false;
				}
				point = true;
			}// eE����ض�Ϊ���ֻ�+-��
			else if(str[i]=='e' || str[i]=='E'){
				if(exp==true || str.length==(i+1) || !(str[i+1]>='0'&&str[i+1]<='9' || str[i+1]=='+' || str[i+1]=='-')){
					return false;
				}
				exp = true;
			}
			else if(str[i]>='0' && str[i]<='9'){
				
			}else{
				return false;
			}
			
		}
		return true;
		
	}

}
