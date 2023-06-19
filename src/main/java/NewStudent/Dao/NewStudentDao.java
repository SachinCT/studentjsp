package NewStudent.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import NewStudentDto.NewStudent;



public class NewStudentDao {

	public EntityManager getManager()
	{
		return Persistence.createEntityManagerFactory("sachin").createEntityManager();
	}
	
	public void studentSignIn(NewStudent student)
	{
		EntityManager em=getManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(student);
		et.commit();
	}
	
	public List<NewStudent> getAllStudents(){
		EntityManager em=getManager();
		
		Query query = em.createQuery("select a from NewStudent a ");
		List<NewStudent> list = query.getResultList();
		return list;
	}
	
	public NewStudent getStudentByEmail(String email) {
		EntityManager em=getManager();
		Query query=em.createQuery("select a from NewStudent a where a.sEmail=?1");
		query.setParameter(1, email);
//		NewStudent student = (NewStudent) query.getSingleResult();
//		return student;
		return (NewStudent) query.getSingleResult();
	}

	public void deleteSudentById(int id) {
		EntityManager em=getManager();
		
		NewStudent student = em.find(NewStudent.class, id);
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(student);
		et.commit();
		
	}

	public NewStudent getStudentById(int id) {
		EntityManager em=getManager();
		EntityTransaction et=em.getTransaction();
		
		NewStudent student=em.find(NewStudent.class, id);
		return student;
		
	}

	public void updateStudent(int id, NewStudent student) {
		EntityManager em=getManager();
		em.find(NewStudent.class, id);
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.merge(student);
		et.commit();
		
	}
	
	
}
