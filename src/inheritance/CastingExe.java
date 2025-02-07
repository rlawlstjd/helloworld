package com.yedam.inheritance;

public class CastingExe {

	public static void main(String[] args) {
		// byte < short < int < long
		int n1 = 100;
		long n2 = 0;
		n1 = (int) n2; // casting
		n2 = n1; // promotion
		
		// Object <- Friend <- ComFriend, UnivFriend 

		Friend f1 = new ComFriend("김민수", "0101-1111", "회사", "부서"); // promotion.
//		ComFriend f2 = (ComFriend) new Friend("", ""); // casting.
		f1 = new Friend("홍길동", "0101-1212");
		System.out.println(f1.toString());

		if (f1 instanceof ComFriend) {
			ComFriend f2 = (ComFriend) f1;
			System.out.println(f2.showInfo());
		} else {
			System.out.println("형변환 못함.");
		}

	}
}
