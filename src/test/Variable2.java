package test;

import java.util.Scanner;

public class Variable2 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in); 
		
		int balance = 0; 
		
		while (true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료"); 
			System.out.println("메뉴를 선택하세요"); 
			int num = s.nextInt(); 
			
			if(num ==1) {
				System.out.println("금액을 입력하세요");
				int input = s.nextInt(); 
				balance += input; 
			} else if (num ==2) {
				System.out.println("금액을 입력하세요");
				int output = s.nextInt(); 
				balance -= output; 
			} else if (num ==3) {
				System.out.println("현재 잔액은" +balance + "원 입니다."); 
			} else if (num ==4) {
				break; 
			}
		}
		
	}
}
