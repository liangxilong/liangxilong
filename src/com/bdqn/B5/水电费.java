package com.bdqn.B5;

public class 水电费 {
	public static char findFirstRepeat(String A, int n) {
    	String[] str=A.split("");
    	for(int i=0;i<n;i++){
    		int index=0;
    		int num=0;
    		//对于每一个值，都需要从前开始遍历
    		while(index<=i){
    			if(str[index].equals(str[i])){
    				num++;
    			}
    			index++;
    		}
    		//该值出现了两次，说明重复了
    		if(num>1){
    			char flag='x';
    			flag=str[i].toCharArray()[0];
    			return flag;
    		}
    		
    		
    	}
    	//返回该值说明已经没有重复的
    	return 'p';
    }
}
