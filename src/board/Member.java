package board;

public class Member {
	private String memberId; 
	private String password; 
	private String memberName;
	
	public Member(String memberId, String password, String memberName) {
		this.memberId = memberId;
		this.password = password;
		this.memberName = memberName; 
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemberNmae() {
		return memberName;
	}
	public void setMemberNmae(String memberNmae) {
		this.memberName = memberNmae;
	}
}
