package board;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {
		Date now = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 날짜 포맷.  
		System.out.println(sdf.format(now)); 
		// 년도-월-일 시:분:초 
		try { // 예외발생시 catch구문을 실행하고 정상적으로 종료. 
			now = sdf.parse("2024-12-25 12:00:00"); // parse Date반환 
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		System.out.println(now); 
		System.out.println("end of prog"); 
		
		
	}
}
