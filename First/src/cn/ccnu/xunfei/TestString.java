package cn.ccnu.xunfei;

public class TestString {
	public static void main(String[] main){
		String s1="abc"+"def";
		String s2=new String(s1);
		if(s1.equals(s2))
			System.out.println("equals succeeded");
		if(s1==s2)
			System.out.println("==succeeded");
	}

}
