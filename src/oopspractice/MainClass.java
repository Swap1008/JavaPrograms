package oopspractice;

public class MainClass extends A {
	public void show() {
		System.out.println("Main class Show");
	}
	public static void main(String[] args) {
		A a=new MainClass();
		a.show();
	}
}
