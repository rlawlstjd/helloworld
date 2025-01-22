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
		List<EBook2> ebooks = new ArrayList<>();
		ebooks.add(new EBook2("자바 기본문법", 50000, EBook2.Category.LANG));
		ebooks.add(new EBook2("자바 알고리즘", 30000, EBook2.Category.APP));
		ebooks.add(new EBook2("파이썬 기본문법", 35000, EBook2.Category.LANG));
		ebooks.add(new EBook2("파이썬 기본문법", 33000, EBook2.Category.LANG));
		ebooks.add(new EBook2("리눅스", 40000, EBook2.Category.APP));
	
		System.out.println("< parallel stream >"); 
		int sum = 
				ebooks 
					.parallelStream()
					// parallelStream 스트림 메소드 사용 시 병렬스트림(멀티쓰레드)이 return 된다. 
					.filter(b -> b.getPrice() < 50000)
					.mapToInt(EBook2::getPrice)
					.sum(); 
		System.out.println(sum); 
		System.out.println(); 
		
		System.out.println("< groupingByConcurrent >"); 
		ConcurrentMap<EBook2.Category, List<EBook2>> ebMap = 
				//Concurrent가 붙을 경우 멀티쓰레드로부터 안전하다는 뜻 
				ebooks
					.parallelStream()
					.collect(Collectors.groupingByConcurrent(EBook2::getCategory)); 
		

	}
}

class EBook2 implements Comparable<EBook2>{
	public enum Category {
		LANG, APP
	}
	private String title; 
	private int price; 
	private Category category; 
	
	public EBook2(String title, int price, Category category) {
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
		return "[title= " + title + ", price=" + price + ", category=" + category +"]"; 
	}
	@Override
	public int compareTo(EBook2 b) {
		return title.compareTo(b.title); 
	}
}