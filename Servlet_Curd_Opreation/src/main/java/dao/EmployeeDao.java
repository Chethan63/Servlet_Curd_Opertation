package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Employee e) {
		entityTransaction.begin();
		entityManager.persist(e);
		entityTransaction.commit();
	}

	public String delete(int id) {
		System.out.println("dao" + id);
		Employee e1 = entityManager.find(Employee.class, id);
		if (e1 != null) {
			entityTransaction.begin();
			entityManager.remove(e1);
			entityTransaction.commit();
			return "Data Deletete successfully";
		} else
			return "No data found";
	}

	public Object find(int id) {
		Employee e1 = entityManager.find(Employee.class, id);
		if (e1 != null) {
			return e1;
		} else
			return "Data is not found";
	}
	
	public Employee findid(int id) {
		Employee e1 = entityManager.find(Employee.class, id);
		return e1;
	}

	public List<Employee> Fetchall() {
		Query q = entityManager.createQuery("select data from Employee data");
		List<Employee> e = q.getResultList();
		return e;
	}

	public String deleteall()
	{
		Query q=entityManager.createQuery("select data from Employee data ");
		List<Employee>e=q.getResultList();
		if(e.isEmpty()) {
			return "Data not found";
		}else {
			for(Employee employee:e) {
				entityTransaction.begin();
				entityManager.remove(employee);
				entityTransaction.commit();
			}
			return "Data is Deleted";
		}
		
	}
	
	public void update(Employee emp) {
		entityTransaction.begin();
		entityManager.merge(emp);
		entityTransaction.commit();
	}
}
