package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.Writer;
import java.io.*; 

public class FileExe {
	public static void main(String[] args) {
		// 출력 스트림( 바이트기반) OutputStream
		
		// c:/temp/sample.PNG -> c:/temp/copy.PNG 생성. 
		
		try(
				Reader reader = new FileReader("c:/temp/test2.txt"); 
		){
			while (true) {
				int chr = reader.read();  //char(2byte); 
				System.out.println((char)chr);  // 65 -> A
				if (chr == -1) {
					break; 
				}
			}
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
 
		
		
	
	}
	
	void donno() {
		try(
				Reader reader = new FileReader("C:/temp/ListExe.java"); 
		){
			
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
	}
	
	void write() {
		try (
				Writer wr = new FileWriter("c:/temp/test2.txt");
				){
			
			wr.write(65); // int매개값. 
			wr.write(new char[] {'B', 'C'}); 
			wr.write("DEF"); 
			
			// write.flush; 
			// wrtie.close; 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void copy () {

		try (
				InputStream is = new FileInputStream("c:/temp/sample.jpg"); 
				OutputStream os = new FileOutputStream("c:/temp/copy.jpg"); 
				){
			 	int data = -1; 
			 	byte[] buf = new byte[1000000]; 
			 	while(true) {
			 		data = is.read(buf);
			 		
			 		os.write(buf);  // 출력(바이트 쓰기 
			 		
			 		if (data == -1) {
			 			break; 
			 		}
			 	}
			 	is.close(); 
			 	os.flush(); // 버퍼 비우기?  
			 	os.close(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
	}
	
	void input() {

		try(
				FileInputStream is = new FileInputStream("c:/temp/test1.dat");
		){
			int data;
			while ((data = is.read()) != -1) {
				System.out.println(data); 
			}
			
		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
	
	void output() {
		try (
				OutputStream os = new FileOutputStream("c:/temp/test1.dat");
			){
			
			os.write(10);  // 파일이 있을수도 , 없을수도 , IOExcpetion 
			os.write(20); 
			os.write(30); 
			os.write(40); // 쓰기 . 
			os.flush(); // 버퍼 비우기 . 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of prog"); 
	}
}

