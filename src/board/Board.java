package board;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 게시글 제목, 내용 , 작성자, 작성일시, 
 */
public class Board {
	private String title; 
	private String content; 
	private String writer; 
	private Date writeDate; 
	
	//생성자 
	public Board(String title, String content, String writer, Date writeDate) {
		this.title = title; 
		this.content = content; 
		this.writer = writer; 
		this.writeDate = writeDate; 
	}
	
	public void setTitle(String title) {
		this.title = title; 
	}
	public String getTitle() {
		return title; 
	}
	public void setContent(String content) {
		this.content = content; 
	}
	public String getContent() {
		return content; 
	}
	public void setWriter(String writer) {
		this.writer = writer; 
	}
	public String getWriter() {
		return writer; 
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate; 
	}
	public Date getWriteDate() {
		return writeDate; 
	}
	
	// ShowBoard() 
	public String showBoard() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		return title + " " + content + " " + writer + " " + sdf.format(writeDate) ; 
	}
}
