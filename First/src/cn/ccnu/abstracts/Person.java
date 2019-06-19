package cn.ccnu.abstracts;

abstract class Person {
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void say(){
		System.out.println(this.getContent());
	}
	public abstract String getContent();

}
