package mypack;

public class StudentBo {
	StudentDao studentdao;
	
	public StudentBo(StudentDao studentdao) {
		this.studentdao = studentdao;
	}
	public void add(Student stu)
	{
		studentdao.addStudent(stu);
	}
	public Student get()
	{
		return studentdao.getStudent();
	}
}
