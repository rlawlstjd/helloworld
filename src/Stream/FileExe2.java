package Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileExe2 {
	public static void main(String[] args) {
		// 보조스트림 
		try(
				Reader reader = new FileReader("C:/temp/test2.txt");  
				BufferedReader br = new BufferedReader(reader); 
		){
			while(true) {
				String str = br.readLine(); 
				System.out.println(str); 
				
			}
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}
