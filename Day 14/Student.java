package Day14Pack;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private int marks;
	
	
	public Student(int rollno, String name, int age, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stud= new ArrayList<Student>();
		stud.add(new Student(5, "Ketan", 25, 80));
		stud.add(new Student(10, "sam", 26, 70));
		stud.add(new Student(15, "Todd", 20, 60));
		stud.add(new Student(20, "John", 23, 55));
		stud.add(new Student(25, "smith", 24, 78));
		System.out.println("Name in list start with 's'");
		stud.stream().filter(refn->refn.getName().startsWith("s")).forEach(refn->System.out.println("> "+refn.getName()));
		
		int more=(int)(stud.stream().filter(refs->refs.getMarks()>=70).count());
		System.out.println("Student with more than 70 marks is :"+more);
		
		int betAge=(int)(stud.stream().filter(refa->refa.getAge()>22 && refa.getAge()<25).count());
		System.out.println("Student between Age 22 and 25 is :"+betAge);
		
	}

}
