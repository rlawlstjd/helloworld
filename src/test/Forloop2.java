package test;

import java.util.Scanner;

public class Forloop2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		
		//String[] a = "홍길동,80".split(","); 
		//System.out.println(a[0]); 
		//System.out.println(Integer.parseInt(a[1])+ Integer.parseInt("80")); 
		//System.out.println("이름, 점수 값을 입력"); 
		//String uservla = s.nextLine(); 
		//String[] a = "이름,은 ,홍길동,이고 ,점수,는 ,80,입니다.".split(","); 
	//	for (int i=0; i<a.length; i++) {
	//		System.out.println(a[i]); 
	//	}
		//String a = s.nextLine(); 
		//String[] b = a.split(","); 
		
		//System.out.println("이름은" + b[0] +"이고 점수는" + b[1]); 
		
		
		//boolean run = true;
		//while (run) {
			
			
		//}
		
//		String[] studentAry = new String[3]; 
//		boolean run = true; 
//		
//		for (int i=0; i<studentAry.length; i++) {
//			System.out.println(studentAry[i]); 
//		
//		}
		
		
		boolean run = true; 
		String[] a = new String[5];
		int max = 0; 
		while(run) {
			System.out.println("1.학생이름,점수 2.최고점수 3.학생입력(단건) 4.점수조회 9.종료");
			System.out.println("<선택하세요>"); 
			int pick = s.nextInt(); 
			s.nextLine(); 
			
			
			switch (pick) {
							case 1:
								System.out.println("학생이름, 점수를 입력하세요"); 
								for (int i=0; i<a.length; i++) {
									a[i] = s.nextLine();  
								}
								break; 
							case 2:
								for (int i=0; i<a.length; i++) {
									if (a[i] != null) {
										if (max < Integer.parseInt(a[i].split(",")[1])) {
											max = Integer.parseInt(a[i].split(",")[1]); 
										}
									} 
								}
								System.out.println(max); 
								break; 
							case 3:
								for(int i=0; i<a.length; i++) {
									if (a[i] == null) {
										System.out.println("학생이름, 점수를 입력하세요"); 
										a[i] = s.nextLine(); 
										break; 
									}
								}
								break; 
							case 4: 
								System.out.println("학생 이름을 입려하세요"); 
								String name = s.nextLine(); 
								
								for (int i=0; i<a.length; i++) {
									if (a[i].split(",")[0].equals(name)) {
										System.out.println(a[i].split(",")[0] + "의 점수는 " + a[i].split(",")[1]); 
									}
								}
								
								break; 
							case 9:
								System.out.println("시스템을 종료합니다."); 
								run = false; 
								break; 
			}
			
		}
		
	}
}
