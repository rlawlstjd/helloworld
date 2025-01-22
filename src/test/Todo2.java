package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 친구정보관리 앱 v.1
 * 이름 연락처 성별.(남,여) -> 홍길동, 010-0000-0000,남  
 
 *	1.목록(이름, 연락처,성별 ) 2. 등록 3.조회 (성별) 4.삭제 5이름:연락처 수정 9(종료)
 	
 * String [] friendsArr = new String[100]; 
 */


public class Todo2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		String[] friendsArr = new String[100]; 
		boolean run = true; 
		int number = 1;
		
		while (run) {
			System.out.println("1.목록 2.등록 3.조회(성별) 4.삭제 5.연락처 수정(이름) 9.종료"); 
			int pick = s.nextInt(); 
			s.nextLine(); 
			
			switch (pick) {
							case 1:
								for (int i=0; i<friendsArr.length; i++) {
									if (friendsArr[i] != null) {
										 
										System.out.println(i + ": " +friendsArr[i]); 
									}
								}
								break; 
							case 2:
								System.out.println("등록할 이름,연락처,성별을 입력해 주세요."); 
								for (int i=0; i<friendsArr.length; i++) {
									if (friendsArr[i] == null) {
										friendsArr[i] = s.nextLine(); 
										
										break; 
									}
								}
								break; 
							case 3:
								System.out.println("조회할 이름을 입력해 주세요"); 
								String name = s.nextLine(); 
								for (int i=0; i<friendsArr.length; i++) {
									if (friendsArr[i] != null) {
										if(friendsArr[i].split(",")[0].equals(name)) {
											System.out.println(friendsArr[i].split(",")[0] + "의 성별은 " + friendsArr[i].split(",")[2] + "입니다." ); 
										}
									}
								}
								break; 
							case 4:
								List<String> friends = new ArrayList<>(Arrays.asList(friendsArr));
								System.out.println("지울 정보의 숫자를 입력하세요"); 
								friends.remove(s.nextInt()); 
								
								int arrListSize = friends.size(); 
								friendsArr = friends.toArray(new String[arrListSize]);  
								break; 
							case 5:
								System.out.println("수정할 이름을 입력하세요"); 
								String edit = s.nextLine(); 
								for (int i=0; i<friendsArr.length; i++) {
									if(friendsArr[i] != null) {
										if (friendsArr[i].split(",")[0].equals(edit)) {
											System.out.println("변경할 이름을 입력하세요"); 
											String nN = s.nextLine(); 
											friendsArr[i]=nN+","+friendsArr[i].split(",")[1]+","+friendsArr[i].split(",")[2];
											
										}
									}
								}
								break; 
							case 9:
								run = false; 
								break; 
			}
		}
	}
}

