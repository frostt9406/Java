package javatraining;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evenodd(2));

	}
	public static String evenodd(int num) {
		 String sol=(num%2==0?"even":"odd");
		return (sol);
	}

}
