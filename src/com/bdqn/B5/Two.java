package com.bdqn.B5;

import java.util.Arrays;
import java.util.Scanner;

//2 镜像字符串，给定两个字符串，判断第二个是否为第一个的镜像字符串，是返回yes，否返回no.
//split() 
public class Two {
//	static String is;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String str = input.next();
		System.out.print("请输入另一个字符串：");
		String str2 = input.next();
		String[] strs = str.split("");
		String temp = "";
		//判断长度
		 if(str.length()-str2.length()!=0) {
	            System.out.println("no");
	            return;
	      }
//		 System.out.println(strs.length);
//		 for (String j : strs) {
//			System.out.println(j);
//		}
		 for (int i = strs.length-1; i >= 0 ; i--) {
			 temp += strs[i];
		}
//		 System.out.println(temp);
		 if(temp.equals(str2)) {
			 System.out.println("yes");
		 }else {
			 System.out.println("no");
		 }
		 
	
	}

}
