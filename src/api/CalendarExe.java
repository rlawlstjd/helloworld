package api;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();  // 인스턴스 . 
		today.set(Calendar.YEAR, 2024); // 세팅하고자하는 달 , 일,  두번째 아규먼트에 셋틸할 숫자 .  .set(?,?) 
		today.set(2024, 1, 19);  //이렇게도 됨. 날짜는 안되는 것 같음. 
		
		
		
		int year = today.get(Calendar.YEAR); 
		int month = today.get(Calendar.MONTH)+1; 
		int date = today.get(Calendar.DATE); 
		int day = today.get(Calendar.DAY_OF_WEEK); 
		int dayOfMonth = today.getActualMaximum(Calendar.DATE); // 말일 ..말월.. 말주.. 메소드 getActualMaximum; 
		
		
		
		System.out.println(year +  " " + month + " " + date + " " + day ); 
		System.out.println("\n" + dayOfMonth); 
		
		
		System.out.println(year);
		System.out.println(month); 
		
		
		
		//System.out.println(Calendar.YEAR); 
		
		
		
	}
}

