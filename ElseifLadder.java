package javatraining;
import java.util.Scanner;
public class ElseifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		int n1= obj.nextInt();
		int n2= obj.nextInt();
		int n3= obj.nextInt();
		
		if(n1%2==0 && n2%2==0 && n3%2==0) {
			System.out.println(n1*n2*n3);
			
		}
		else if(n1%2==0 && n2%2!=0 && n3%2!=0) {
			System.out.println(n1);
		}
		else if(n1%2==0 && n2%2==0 && n3%2!=0) {
			System.out.println(n1+n2);
			
		}
		else if(n1%2==0 && n2%2!=0 && n3%2==0) {
			System.out.println(n1+n3);
			
		}
		else if(n1%2!=0 && n2%2==0 && n3%2==0) {
			System.out.println(n3+n2);
			
		}
		else {
			System.out.println(0);
		}
		
		

	}

}
