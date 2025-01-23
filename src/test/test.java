package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class test {
	public static void main(String[] args) {
		//optional 클래스는 '요소'의 null 체크를 선언형 프로그래밍 방법으로 할 수 있게 해주는 것이 optional클래스이다. 
		// stream과 동작 매커니즘은 유사하지만, optional 클래스는 null 체크를 위한 wrapper클래스이다.(용도의 차이) 
		
		List<EBook> ebooks = new ArrayList<>(); 
		ebooks.add(new EBook("자바 기본문법", 50000, EBook.Category.LANG));
		ebooks.add(new EBook("자바 알고리즘", 30000, EBook.Category.APP));
		ebooks.add(new EBook("파이썬 기본문법", 35000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("파이썬 기본문법", 33000, EBook.Category.LANG));
		ebooks.add(new EBook("리눅스", 40000, EBook.Category.APP));
		
		System.out.println("< of(instance) >"); 
		EBook eb = new EBook("AWS", 40000, EBook.Category.APP); 
		Optional<EBook> opt = Optional.of(eb); 
		// Optional.of 를 통해 인스턴스를 Optioanl 클래스에 담고있다. 
		System.out.println(opt.get()); 
		// get메서드를 사용해서 Optional 인스턴스에 저자외어 있는 요소를 가져올 수 있다. 
	
	}
}

class Monitor {
	private Optional<Screen> screen; 
	
	public Optional<Screen> getScreen() {
		return screen;
	}
	public void setScreen(Optional<Screen> screen) {
		this.screen = screen; 
	}
}

class Screen {
	private Optional<Panel> panel;
	
	public Optional<Panel> getPanel(){
		return panel; 
	}
	public void setPanel(Optional<Panel> panel) {
		this.panel = panel; 
	}
}

class Panel {
	private String type; 
	private String type2; 
	
	public String getType (){
		return type; 
	}
	public void setType(String type) {
		this.type = type; 
	}
	public void setType2(String type2) {
		this.type2 = type2;

	}
	@Override
	public String toString() {
		return type + type2; 
	}
}

class EBook implements Comparable<EBook> {
	public enum Category {
		LANG, APP
	}
	private String title;
	private int price;
	private Category category;
	
	public EBook(String title, int price, Category category) {
		this.title = title;
		this.price = price;
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return "[title=" + title + ", price=" + price + ", category=" + category + "]";
	}
	@Override
	public int compareTo(EBook b) {
		return title.compareTo(b.title);
	}
	@Override
	public int hashCode() {
		return Objects.hash(title, price, category);
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EBook))
			return false;
		EBook eb = (EBook)o;
		return title.equals(eb.getTitle()) && (price == eb.price) && category.equals(eb.getCategory());
	}

}

