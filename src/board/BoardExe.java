package board;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// 실행클래스 . 
// 1.글목록 2.글등록 3. 삭제 9.종료 
public class BoardExe {
	static Board[] boardRepo = new Board[100]; 
	static Scanner s = new Scanner(System.in); 
	static String LoginId; //로그인 아이디를 저장. 
	
	public static void main(String[] args) {
		MemberExe exe = MemberExe.getInstance(); 
		
		while(true) {
			// id, password 일치하면 글목록기능 사용.
			System.out.println("아이디를 입력하세요");
			String id = s.nextLine(); 
			System.out.println("비밀번호를 입력하세요"); 
			String password = s.nextLine();
			String name = exe.login(id, password);
			if (name != null) {
				LoginId = id;  // 여러메소드 공용사용. 
				System.out.println(name + "님 환영합니다."); 
				break; // while문 반복 종료 . 
			} else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다. "); 
			}
		}
		
		
		boolean run = true; 
		try {
			initDate();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //초기 데이터 생성 
		
		
		while(run) {
			System.out.println("1.글목록 2.글등록 3.삭제 9.종료"); 
			System.out.println("선택>"); 
			int menu = Integer.parseInt(s.nextLine()); 
			
			switch(menu) {
							case 1: // 목록
								boardList(); 
								break; 
							case 2: // 등록
								addBoard(); 
								break; 
							case 3: // 삭제
								delBoard(); 
								break; 
							case 9: // 종료 
								System.out.println("프로그램을 종료합니다"); 
								run = false; 
								break; 
							default: // 제외한 숫자 
								System.out.println("메뉴를 확인하세요"); 
			}
		} // end of while
		System.out.println("end of prog"); 
	} // end of main
	public static void initDate() throws ParseException {
		//배열의 샘플데이터 
		// 1페이지: 0~4, 2페이지: 5~9 3페이지: 10~14
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		boardRepo[0] = new Board("게시글제목1", "내용입니다1", "user01", sdf.parse("2025-01-27")); 
		boardRepo[1] = new Board("게시글제목2", "내용입니다2", "user03", sdf.parse("2025-01-28")); 
		boardRepo[2] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-29")); 
		boardRepo[3] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
		boardRepo[4] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
		
		boardRepo[5] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
		boardRepo[6] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
		boardRepo[7] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
		boardRepo[8] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
		boardRepo[9] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
	
		boardRepo[10] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
		boardRepo[11] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 
		boardRepo[12] = new Board("게시글제목3", "내용입니다3", "user02", sdf.parse("2025-01-27")); 



	}
	
	public static void boardList() {
		//글목록.
		// 1페이지: 0~4, 2페이지: 5~9 3페이지: 10~14
		// 배열을 매개값으로 전달하면 건수가 몇 건 반홤 네솓, / 
		int page = 1; // while문 때문에 초기화 되므로 밖으로 뺌. 
		int lastPage = (int) Math.ceil(getMaxCount() / 5.0);
		while(true) {
		
//			int endCnt = page * 5; 
//			int startCnt = endCnt - 5; 
//			int loopCnt = 0; 
//			System.out.println("글 번호 글 제목 내용 작성자 작성일시"); 
//			System.out.println("---------------------");
//			for (int i=0; i< boardRepo.length; i++) {
//				if (boardRepo[i] != null) {
//					loopCnt++; 
//					if ( loopCnt > startCnt && loopCnt <= endCnt) {
//			
//					}
//				}
//			}
			int firstIdx = (page -1) * 5;  // page: 2 -> 5; 
			int lastIdx = (page * 5) - 1;  // page:2 -> 9; 
			for (int i=firstIdx; i <=lastIdx; i++) {
				if (boardRepo[i] != null) {
					System.out.println(boardRepo[i].showBoard()); 
				}
			}
			System.out.println("이전페이지:q, 이후페이지:n, 종료: q"); 
			String sel = s.nextLine(); 
			if (sel.equals("n")) {
				page ++; 
				// 마지막페이지보다는 작은값 
				
			} else if (sel.equals("q")) {
				// 1보다는 큰 페이지 
				page --; 
			} else if (sel.equals("p")) {
				return; // 메소드 종료  
			} else {
				System.out.println("다시 입력해 주세요"); 
			}
		}
		//		for (int i=0; i < boardRepo.length; i++) {
//			if (boardRepo[i] != null) {
//				System.out.println(boardRepo[i].showBoard()); 
//			}
//		}
	}
	//글등록. 
	//제목 : 5글자 이상 ~ 15글자 이하. 콘솔출력("등록불가합니."); 
	// 똑같은 글제목이 있으면 콘솔출력 (이미 있음) 
	public static void addBoard() {
		//글등록.
		int min = 5; 
		int max = 15; 
		System.out.println("제목을 입력하세요"); 
		String title = s.nextLine(); 
		if (title.length() < min || title.length() > max) {
			System.out.println("제목은 5글자 ~ 15글자 이하여야함."); 
			return ; 
		}
		System.out.println("내용을 입력하세요"); 
		String content = s.nextLine(); 
//		System.out.println("저자를 입력하세요"); 
//		String writer = s.nextLine(); 
//		System.out.println("작성날짜를 입력하세요"); 
//		String date = s.nextLine();
		
		for (int i=0; i<boardRepo.length; i++) {
			if (boardRepo[i] == null) {
				for (int j=0; j < boardRepo.length; j++) {
					if (boardRepo[j].getTitle().equals(title)) {
						System.out.println("이미 존재하는 제목입니다."); 
						return ; 
					}
				} 
			boardRepo[i] = new Board(title, content, LoginId, new Date()); // new Date 시스템 날짜를 받아옴.  
			System.out.println("등록완료"); 
			break;  // break;  하나만 . 
			}
		}
	}
	public static void delBoard() {
		//글삭제. 글 제목을 입력받고 같은 제목을 삭제 .  삭제는 null값을 대입 해주면 삭제 
		System.out.println("삭제할 책의 제목을 입력하세요"); 
		String find = s.nextLine(); 
		
		for (int i=0; i<boardRepo.length; i++) {
			if (boardRepo[i].getTitle().equals(find)) {
				boardRepo[i] = null;  // 삭제 . 
				System.out.println("삭제완료"); 
				break; 
			}
		}
	}
	public static int getMaxCount() {
		int count =0; // 전체건수 
		for (int i=0; i< boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				count++; 
			}
		}
		return count; // 건수반환. 
	}
}
