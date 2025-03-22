package javatraining;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		// consonant or vowel check
		Scanner obj= new Scanner(System.in);
		char ch= obj.next().charAt(0);
		System.out.println(isVowel(ch));

	}
	public static String isVowel(char ch) {
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return "Vowel";
		}
		else {
			return "Consonant";
		}
	}

}
