package javaTest;
class Student{
	private int num;
	private String name;
	private String phone;
	
	public Student(int num, String name, String phone) {
		this.num = num;
		this.name = name;
		this.phone = phone;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
}
public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student(1,"민선주","010-1111-1111");
		Student student2 = new Student(2,"홍길동","010-2222-2222");
		Student student3 = new Student(3,"황진이","010-3333-3333");
		
		Student[] students = {student1, student2, student3};
		
		for(int i=0; i<students.length; i++) {
			System.out.println("학번: "+ students[i].getNum()+
			", 이름: "+ students[i].getName() + ", 전화번호: "+ students[i].getPhone());
		}
	}
}
