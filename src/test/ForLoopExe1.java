package test;

import java.util.Scanner;

public class ForLoopExe1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		boolean run = true; 
		int point[] = new int[5]; 
		int max = 0; 
		int num = 0; 
		int sum = 0; 
		int avgPoint = 0; 
		int avgNum = 0; 
		
		
		while (run) {
			System.out.println("1.학생점수 입력 2.최고점수 3.평균, 합계점수 4.종료"); 
			int pick = s.nextInt();
			
			switch (pick) {
							case 1:
								System.out.println("학생의 점수를 입력해 주세요"); 
								for (int i=0; i<point.length; i++) {
									point[i] = s.nextInt(); 
								}
								/*System.out.println("학생의 점수를 입력해 주세요"); 
								point[num++] = s.nextInt(); 
								avgNum++; 
								*/
								break;
								
							case 2: 
								for (int i=0; i<point.length; i++) {
									if (point[i] > max) {
										max = point[i]; 
									}
								}	
								System.out.println("최고점수" + max); 
								break; 
								
							case 3:
								for (int i=0; i<point.length; i++) {
									sum += point[i]; 
								}
								avgPoint = sum / point.length; 
								System.out.println("평슌 점수: " + (float)avgPoint ); 
								System.out.println("합계 점수: " + sum); 
								break; 
							
							/*case 4: 
								for (int i=0; i<point.length; i++) {
									sum += point[i]; 
								}
								System.out.println("합계점수: " + sum); 
								break; 
							*/	
							case 4: 
								System.out.println("시스템이 종료됩니다."); 
								run = false; 
								break; 
								
							default: 
								System.out.println("다시 입력해 주세요"); 
								
			}
		}	
	}
}

/*
 * 학생 점수를 입력받아 배열에 저장. 
 * 최고점수, 평균, 합계점수 출력 
 * 
 */

/*
 * 
 * int point[] = new int[5]; 
		int sum = 0 ; 
		int avgPoint = 0; 
		int max = 0;
		
		for (int i=0; i<point.length; i++) {
			point[i] = (int)(Math.random()*101); 
			System.out.println(point[i]);
			sum += point[i]; 
		}
		
		avgPoint = sum / point.length; 
		System.out.println("평슌 점수:" + avgPoint ); 
		
		
		for (int i=0; i<point.length; i++) {
			if (point[i] > max) {
				max = point[i]; 
			}
		}	
		
		System.out.println("최고점수" + max)
 */
