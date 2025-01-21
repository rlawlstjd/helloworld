package helloworld;

public class hW {
	public static void main(String[] args) {
		
		// int (4byte)
		int num1 = 1101111; 
		 
		byte num2 = 127; // byte(1byte)
		short num3 = 128; // short(2byte) 
		long num4 = 9223372036854775807l;
		System.out.println(Long.MAX_VALUE);
		
		byte num5 = 20; 
		byte result = (byte) (num2 + num5); // 강제형변환 casting 
		System.out.println(result);
		int intResult = num1 + num5; 
		
		// 데이터 타입 변수이름 = 값 
		int[] arr = {1,2,3,4};  
		// int[] arr = {}; 
		// int[] arr = new int[3] 
		// int[] arr = new int []{1,2,3};  
		
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); 
		}		
		
		String[] strArr = {"홍길동", "박길동", "최길동"}; 
		strArr[2] = "김씨";  // 베열 크기 변경 불가 
		
		int[] anotherArr = new int[10];  // 크기 10을 생성.
		for (int i=0; i<anotherArr.length; i++) {
			anotherArr[i] = (int)(Math.random() *100);
		}
		
		for (int num : anotherArr) {
			System.out.println(num); 
		}
		System.out.println(anotherArr); // 배열의 주소 .  
		
		
		

	}
}
