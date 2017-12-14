package com.bdqn.B5;

import java.util.Scanner;

//4 对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符，如果没有返回null,如果有返回字符的字符串，然后取出字符即可。
public class For {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str = input.next();
		String[] strs=str.split("");
		String flag="null";
    	for(int i = 0 ; i < strs.length ; i++){
    		int index = 0;
    		int num = 0;

    		while(index <= i){
    			if(strs[index].equals(strs[i])){
    				num++;
    			}
    			if(num > 1){
    				flag = strs[index];
    				System.out.println(flag);
//    				break;
    				return;
    			}
    			index++;
    		}
//    		flag = "null";
    		
    	}
    	System.out.println(flag);
		
	}

}
