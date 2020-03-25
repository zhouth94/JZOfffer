package 剑指Offfer;

public class 表示数值的字符串 {
	public boolean isNumeric(char[] str){
		boolean point = false,exp = false;
		for(int i = 0;i < str.length;i ++){
			if(str[i]=='+' || str[i]=='-'){
				//+-号后面必定为数字或后面为. （-.123 = -0.123）
				if(i+1==str.length || !(str[i+1]>='0'&&str[i+1]<='9' || str[i+1]=='.')){
					return false;
				}
				// +-号只出现在第一位或eE的后一位
				if(!(i==0 || str[i-1]=='e' || str[i-1]=='E')){
					return false;
				}
			}// .后面必定为数字 或为最后一位（233. = 233.0）
			else if(str[i]=='.'){
				if(point==true || exp==true || !(str.length>(i+1) && str[i+1]>='0' && str[i+1]<='9')){
					return false;
				}
				point = true;
			}// eE后面必定为数字或+-号
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
