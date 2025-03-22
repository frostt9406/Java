package javatraining;
import java.util.Scanner;
public class ifWithMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println(multiple(a,b));

	}
	public static int multiple(int a,int b) {
		if (a==0||b==0) {
			return 3;
		}
		else if(a%b==0 || b%a==0) return 2;
		else return 1;
	}

}
