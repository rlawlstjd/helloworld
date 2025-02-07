package Stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExe {
	public static void main(String[] args) {
		StudentApp sa = new StudentApp(); 
		
		sa.start(); 
	}
}


class Student {
	private String name; 
	private double height; 
	private double weight; 
	private int score;
	
	public Student(String name, double height, double weight, int score) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	} 
}


class StudentApp {
	Scanner s = new Scanner(System.in);
	
	List<Student> students ;
	
	public StudentApp () {
		students = new ArrayList<>(); 
	} 
	
	
	public void start()	{
		while (true) {
			System.out.println("1.목록 2.추가 3.삭제 9.종료");
			System.out.println("선택 >>"); 
			
			int menu = s.nextInt(); s.nextLine(); 
			switch (menu) {
							case 1: 
								studentList(); 
								break;
							case 2: 
								addStudent();
								break; 
							case 3:
								removeStudent(); 
								break; 
							case 9: 
								System.out.println("프로그램을 종료합니다."); 
								save();
								return ; 
								
			}
		}
	}
	
	public void studentList() {
		System.out.println("학생들 전체 목록"); 
		System.out.println("==============="); 
		
		for (int i=0; i<students.size(); i++) {
			System.out.println("이름: " + students.get(i).getName() 
					+ ", 키: " + students.get(i).getHeight() 
					+ ", 몸무게: " + students.get(i).getWeight() 
					+ ", 점수: " + students.get(i).getScore()); 
		}
	}
	public void addStudent() {
		System.out.println("학생이름 입력 >> ");
		String name = s.nextLine(); 
		System.out.println("학생 키 입력 >> ");
		double height = Double.parseDouble(s.nextLine());//s.nextDouble(); 
		System.out.println("학생 몸무게 입력 >> "); 
		double weight = Double.parseDouble(s.nextLine()); //s.nextDouble(); 
		System.out.println("학생 점수 입력 >> "); 
		int score = Integer.parseInt(s.nextLine()); //s.nextInt();
		
		students.add(new Student(name, height, weight, score)); 
	}
	public void removeStudent() {
		System.out.println("학생이름 입력 >> "); 
		String name = s.nextLine(); 
		
		for (int i=0; i<students.size(); i++) {
			if (students.get(i).getName().equals(name)){
				students.remove(i); 
			}
		}
	}
	public void save() {
		 // 파일 경로 설정
        File file = new File("C:/temp/student_data.txt");

        // BufferedWriter 사용해서 파일에 저장
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Student student : students) {
                // 학생 정보 파일에 저장 (이름, 키, 몸무게, 점수)
                writer.write("이름: " + student.getName() +
                        ", 키: " + student.getHeight() +
                        ", 몸무게: " + student.getWeight() +
                        ", 점수: " + student.getScore());
                writer.newLine(); // 각 학생 정보는 한 줄씩 띄어쓰며 저장
            }
            System.out.println("학생 정보가 파일에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다: " + e.getMessage());
        }
	}
}
