package chapter06.data;

public class PersonExample {
	public static void main(String[] args) {
		/*Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		Person p2 = new Person();
		p2.name="신용권";
		p2.age =19;*/
		
		//생성자 //Java Beans Pattern
		/*Person p1 = new Person("홍길동",20);*/
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		System.out.println(p1.getName());//*
		Person p2 = new Person();
		p2.setName("신용권");
		p2.setAge(19);
		System.out.println(p1.getAge());//*
	}
}
