package assignment1;

import java.util.Scanner;

public class HighestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("enter the values of a,b and c");
		Scanner sc = new Scanner (System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c){
			System.out.println("highest value "+a);
		}
		if(b>a && b>c){
			System.out.println("highest value is "+b);
			
		}
		if(c>a && c>b){
			System.out.println("highest value is "+c);
						
		}
	}

}
