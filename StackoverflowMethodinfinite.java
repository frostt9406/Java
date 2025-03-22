package javatraining;

public class StackoverflowMethodinfinite {
static int num=0;
	public static void main(String[] args) {
		System.out.println("Main Start");
		m1();
		System.out.println("Main End");

	}
	public static void m1() {
		num++;
		m2();
		
	}
	public static void m2() {
		System.out.println(num);
		m1();
	}

}
