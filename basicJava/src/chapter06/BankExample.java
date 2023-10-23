package chapter06;

public class BankExample {
	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount();
		a.balance=100;
		b.balance-=50;
		System.out.println(b.balance); // static 없을때는 0 있으면 100(8번없다고 할때)
	}
}
