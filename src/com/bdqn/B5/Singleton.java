package com.bdqn.B5;
//3 写一个Singleton出来  Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。
public class Singleton {
	
	private static Singleton singleton;
	  private Singleton(){
	   System.out.println("一个!");
	  }
	  public static Singleton getSigleton(){
	   if(singleton == null) {
		   singleton = new Singleton();
		  
	   }
	   return singleton;
	  }
}
 

