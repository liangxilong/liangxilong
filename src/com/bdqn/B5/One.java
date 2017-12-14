package com.bdqn.B5;

import java.util.Scanner;

//1 给定一个正整数，编写程序计算有多少对质数的和等于这个输入的正整数，并输出结果，
//(10W以内)
public class One {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int num = input.nextInt();
		int sum = 0;
		// if(num == 2) {
		// System.out.println("请输入一个正整数：");//2特殊处理
		// }
		// if(num < 2 || num % 2 == 0) {
		// System.out.println("您输入的不是偶数或");//识别小于2的数和偶数
		// }
		// for(int i=3; i<=Math.sqrt(num); i+=2){
		// if(num % i == 0){//识别被奇数整除
		// System.out.println("您输入的数不能被奇数整除");
		// }
		// }
		if (num < 1 || num >= 100000) {
			System.out.println("请输入大于1且小于十万的数");
		}
		if (num % 2 != 0) {
			System.out.println("请输入正整数");
		} else {
			// 如果是2
			if (num == 2) {
				sum++;
			}
			// 不是2得情况下    1不是质数所以从3开始
			for (int i = 3; i <= (num / 2); i += 2) {
				if (PrimeNumber(i) && PrimeNumber(num - i)) {
					sum++;
				}
			}
			System.out.println("有"+ sum + "对");
		}

		
		// for(int i = 0 ; i < num ; i++) {
		//
		// }

	}

	// 判断是否是质数
	protected static boolean PrimeNumber(int num) {
		if (num == 2) {
			return true;// 2特殊处理
		}
		if (num < 2 || num % 2 == 0) {
			return false;// 识别小于2的数和偶数
		}
		for (int i = 2; i < num; i ++) {
			if (num % i == 0) {// 识别被奇数整除
				return false;
			}
		}
		return true;
	}

}
