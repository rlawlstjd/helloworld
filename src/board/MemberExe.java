package board;

public class MemberExe {
	// 싱글톤 객체 생성. 
	// 1. 필드를 static 선언. 
	private static MemberExe instance = new MemberExe(); 
	//생성자 은닉
	private MemberExe() {
	}
	// 인스턴스를 제공해주는 메소드 . getInstance() 
	public static MemberExe getInstance() {
		return instance; 
	}
	
	Member[] members = {
			new Member("user01","1111","홍길동"), 
			new Member("user02","2222","김민수"), 
			new Member("user03","3333","박석민")
	};  
	
	
	
	
	
	public String login (String id, String password) {
		for (int i=0; i<members.length; i++) {
			if(members[i] != null && members[i].getMemberId().equals(id) && members[i].getPassword().equals(password)) {
				return members[i].getMemberNmae(); 
			}
		}
		return null; // 일치하는 값이 없음 
	} // end of login(); 
	
//	public String login1 (String id, String password) {
//		for (int i=0; i<members.length; i++) {
//			if(members[i] != null && members[i].getMemberId().equals(id) && members[i].getPassword().equals(password)) {
//				return members[i].getMemberId() + "님 환영합니다."; 
//			}
//		}
//		return "일치하는 값이 없습니다,"; // 일치하는 값이 없음 
//	} // end of login(); 
	
}
