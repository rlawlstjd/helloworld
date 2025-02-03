import board.MemberExe;

public class StaticExe {
	public static void main(String[] args) {
		// m1 m2 참조변수 
		MemberExe m1 = MemberExe.getInstance(); //new MemberExe();  프라이빗이므로 사용불가 .  
		MemberExe m2 = MemberExe.getInstance(); 
		
		System.out.println(m1 == m2); 
		
	
	}
}
