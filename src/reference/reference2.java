package reference;

public class reference2 {
	public static void main(String[] args) {
		
		String[][] info = {
				{"홍길동", "80"},//[0][0] = 홍길동 [0][1] 점수
				{"김민수", "85"}, 
				{"박현수", "88"},
				{"심상현", "90"},
				{"최기동", "75"}
		};
		
		
		for (int i=0; i<info.length; i++) {
			for (int j=0; j<info[i].length; j++) {
				System.out.println(info[i][j]); 
			}
		}
		
		int sum = 0; 
			for (int j=0; j<info.length; j++) {
				sum += Integer.parseInt(info[j][1]); 
			}
		
		String[] temp = {"", "0"}; 
		
		for (int i=0; i<info.length; i++) {
			if (Integer.parseInt(temp[1])  < Integer.parseInt(info[i][1])) {
				temp = info[i]; 
			}
		}
		
		System.out.println(temp[0]); 
	
	}
}
