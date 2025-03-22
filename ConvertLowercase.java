package javatraining;

public class ConvertLowercase {

	public static void main(String[] args) {
		System.out.println("To convert to lowercase");
		lower('N');
		lower('n');

	}
	public static void lower(char ch) {
		char n= (char)(ch+32);
	
		System.out.println(ch>='a'&&ch<='z'?ch:n);//check if upper or lower, print lowercase
	}

}
