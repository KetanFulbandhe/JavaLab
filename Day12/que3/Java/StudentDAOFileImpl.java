package mypack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class StudentDAOFileImpl implements StudentDao {
@Override
public void addStudent(Student a) {
	try(FileOutputStream fos = new FileOutputStream("D:\\abc.txt")){
		try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
//			a.setName(name);
//			a.setAddress(address);
			oos.writeObject(a);
		}
	}catch(Exception e) {
		System.out.println(e);
	}
}

@Override
public Student getStudent() {
	Student ref = null;
	try(FileInputStream fis = new FileInputStream("D:\\abc.txt")){
		try(ObjectInputStream ois = new ObjectInputStream(fis)){
			ref = (Student)ois.readObject();
		}
	}catch(Exception e) {
		System.out.println(e);
	}
	return ref;
}
}
