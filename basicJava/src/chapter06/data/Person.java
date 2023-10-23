package chapter06.data;

public class Person {
	private String name;
	private int age;
	
	//생성자 //Java Beans Pattern=>가장많이 사용
	/*public Person(String name, int age) {
		this.name =name;
		this.age=age;
	}*/
	
	//*
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age =age;
	}
}
