package com.yedam.api;

public class StringExam {
	public static void main(String[] args) {
		// 문제호출.
		no2();
	}

	static void 연습() {
		String str = "hello";
		String str1 = "world";
		StringUtil.연결하기(str, str1);
	}

	static void no1() {
		// "9803061234123" "991112 2341234" 주민등록번호의 성별구분.
		String ssn1 = "9803061234123"; // 7번째값이 성별.
		String ssn2 = "991112 2341234";// 8번째값이 성별.
		String ssn3 = "021112-8341234";// 8번째값이 성별.
		StringUtil.checkGender(ssn3);
	}

	static void no2() {
		// 파일경로와 파일명.
		String file1 = "C:/temp/flower.jpg";
		String file2 = "D:/web/project/guide.mpeg";
		StringUtil.checkExtesion(file2);
	}

	static void no3() {
		// 문자의 갯수를 반환.
		String str1 = "  suggest ";
		String str2 = "  currently  ";
		String str3 = "  particular  ";
		StringUtil.getLength(str1);
	}
}
