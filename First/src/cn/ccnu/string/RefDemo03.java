package cn.ccnu.string;
//接受自己本类的对象
 class Demo{
	private int temp=30;
	public void fun(Demo d2){
		d2.temp=50;
	}
	public int getTemp(){
		return temp;
	}
	public void setTemp(int t){
		temp=t;
	}
}

public class RefDemo03 {
	public static void main(String[] args){
		Demo d1=new Demo();
		d1.setTemp(20);
		d1.fun(d1);
		System.out.println("temp="+d1.getTemp());
	}
}
