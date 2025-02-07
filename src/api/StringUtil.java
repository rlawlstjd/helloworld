package com.yedam.api;

public class StringUtil {
	static void 연결하기(String str, String str2) {
		// 문자열을 연결하는 메소드 "" + "" + ""
		System.out.println(str.concat(", ").concat(str2));
	}

	static void checkGender(String ssn) {
		// 성별을 출력. "남자입니다" 또는 "여자입니다"
		// 번호의 길이를 구분해서 13 또는 14 일 경우.
		int pos = 6;
		if (ssn.length() == 14) {
			pos = 7;
		}
		char chr = ssn.charAt(pos); // 찾고자하는 위치의 문자.
		switch (chr) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("잘못된 값입니다.");
		}
	}

	static void checkExtesion(String file) {
		// 파일의 확장자는 jpg (또는 mp3, hwp) 입니다.
		String ext = file.substring(file.indexOf(".") + 1);
		System.out.printf("파일의 확장자는 %s 입니다.", ext);
	}

	static void getLength(String str) {
		// 문장의 길이는 7글자입니다.
		int len = str.trim().length();
		System.out.printf("문장의 길이는 %d글자입니다.", len);

	}
} // end of StringUtil.
