package test;

import java.util.Scanner;

public class Todo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("숫자를 입력하세요"); 
			int num = s.nextInt(); s.nextLine(); 
			System.out.println("입력한 값은:" + num); 
		
			System.out.println("문자를 입력하세요"); 
			String str = s.nextLine(); 
			System.out.println("입력한 문자:" + str); 
			int a = 50 ; 
			
			int b = Integer.parseInt(str);
			
			int result = a+b; 
			
			System.out.println(result); 
	
		}
	}
}
