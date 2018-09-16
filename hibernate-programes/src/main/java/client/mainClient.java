package client;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import entities.Employee;
import utility.HibernateUtil;

public class mainClient {

	public static void main(String[] args) {
		/*
		 * try (Session session = HibernateUtil.getSessionFactory().openSession()) { //
		 * Check MySQL database version String sql = "select version()"; String result =
		 * (String) session.createNativeQuery(sql).getSingleResult();
		 * System.out.println("MySql Database Version is:::");
		 * System.out.println(result); } catch (HibernateException e) {
		 * e.printStackTrace(); }
		 */
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			//createEmployee(session);
//			getEmployeeById(session);
//			updateEmployeeById(session);
			// deleteEmployeeById(session);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void deleteEmployeeById(Session session) {
		Employee employee = session.get(Employee.class, 1);
		if (employee != null) {
			System.out.println(employee);
			session.beginTransaction();
			session.delete(employee);
			session.getTransaction().commit();
		} else {
			System.out.println("Employee does not exist!!");
		}
	}

	private static void updateEmployeeById(Session session) {
		Employee employee = session.get(Employee.class, 1);
		if (employee != null) {
			employee.setSalary(10000l);
			session.beginTransaction();
			session.update(employee);
			session.getTransaction().commit();
			System.out.println("update method ::  " + employee);
		} else {
			System.out.println("Employee does not exist!!");
		}
	}

	private static void getEmployeeById(Session session) {
		Employee employee = session.get(Employee.class, 1);
		if (employee != null) {
			System.out.println("get method ::  " + employee);
		} else {
			System.out.println("Employee does not exist!!");
		}
	}

	private static void createEmployee(Session session) {
		Employee employee = getEmployee();
		Employee employee1 = getEmployee1();
		Employee employee2 = getEmployee2();
		session.beginTransaction();
		session.persist(employee);
		session.persist(employee1);
		session.persist(employee2);
		session.getTransaction().commit();
	}

	private static Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("OmPrakash Gupta");
		employee.setEmail("r.g0@email.com");
		employee.setSalary(20000000l);
		employee.setDoj(new Date());
		return employee;
	}

	private static Employee getEmployee1() {
		Employee employee = new Employee();
		employee.setEmployeeName("OmPrakash Gupta");
		employee.setEmail("r.g1@email.com");
		employee.setSalary(20000000l);
		employee.setDoj(new Date());
		return employee;
	}

	private static Employee getEmployee2() {
		Employee employee = new Employee();
		employee.setEmployeeName("OmPrakash Gupta");
		employee.setEmail("r.g2@email.com");
		employee.setSalary(20000000l);
		employee.setDoj(new Date());
		return employee;
	}
}
