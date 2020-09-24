package mypack;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;

public class StudentDAODataImpl implements StudentDao {

	@Override
	public void addStudent(Student a) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(a);
		tr.commit();
	}

	@Override
	public Student getStudent() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<?> query=session.createQuery("from Student");
		List<Student> mylist1=(List<Student>) query.list();
		Student ref = mylist1.get(0);
		return ref;
	}

}
