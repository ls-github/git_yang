package cn.ccnu.abstracts;

public class Worker extends Person {
	private float salary;
	
	public Worker(String name, int age,float salary) {
		super(name, age);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return "工人信息-->姓名："+super.getName()+";年龄："+super.getAge()+";工资："+this.salary;
	}
	

}
