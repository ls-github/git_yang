package cn.ccnu.string;

import org.junit.Test;

public class StringTestDemo {
	@Test
	public void StringDemo04(){
		String str1="hello";
		String str2=new String("hello");
		String str3=str2;
		System.out.println("str1==str2-->"+(str1==str2));
		System.out.println("str1==str2-->"+(str1==str3));
		System.out.println("str2==str3-->"+(str2==str3));
		
		
	}

}
