package cn.ccnu.thread;

public class MyThread extends Thread {
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name+"运行,i="+i);
		}
	}

}
