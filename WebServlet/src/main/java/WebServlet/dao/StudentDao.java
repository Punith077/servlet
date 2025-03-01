package WebServlet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import WebServlet.dto.StudentDto;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory(null);
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public String insert(StudentDto d1) {
		entityTransaction.begin();
		entityManager.persist(d1);
		entityTransaction.commit();
		return "account created successfully";
	}
	
	public Object findById(String email) {
		StudentDto sdto=entityManager.find(StudentDto.class, email);
		if(sdto==null) {
			return "no data found";
		}
		else
			return sdto;
	}
	
	public String deleteById(String email) {
		StudentDto sdto=entityManager.find(StudentDto.class, email);
		if(sdto!=null) {
			entityTransaction.begin();
			entityManager.remove(sdto);
			entityTransaction.commit();
			return "data deleted";
		}
		else 
			return "no data found";
	}
	
	
	//list or object
	public List fetchAll() {
		//select vn from tab_name vn;
		Query q = entityManager.createQuery(	"select a from StudentDto a");
		List<StudentDto> list=q.getResultList();
		if(list.isEmpty()) {
			return null;
		}
		else return list;
		
	}
	
	public Object DeleteAll() {
		Query q = entityManager.createQuery(	"select a from StudentDto a");
		List<StudentDto> list=q.getResultList();
		if(list.isEmpty()) {
			return "no data found";
		}
		else {
			for(StudentDto a:list) {
				entityTransaction.begin();
				entityManager.remove(a);
				entityTransaction.commit();
			}
			return "all data deleted";
		}
	}
	
	public void update(StudentDto s1) {
		entityTransaction.begin();
		entityManager.merge(s1);
		entityTransaction.commit();
	}
	
}
