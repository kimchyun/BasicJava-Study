package chapter08;

public interface HttpServlet {
//원래는  abstract interface 
	public abstract void service();
	//굳이 abstract 안써도됨, private 쓰면 안됨, 거의 public 
	//원래 안쓰면 default 인데 여기선 public
}
