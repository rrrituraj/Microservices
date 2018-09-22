package com.hbm.ritu.client;

import com.hbm.ritu.entities.Address;
import com.hbm.ritu.entities.Employee;
import com.hbm.ritu.entities.Person;
import com.hbm.ritu.entities.Student;
import com.hbm.ritu.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

public class FetchDataClientTest {

	public static void main(String[] args) {
	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			/*Person person = session.get(Person.class, 3);
			if ((person instanceof Person) && !(person instanceof Employee) && !(person instanceof Student)){
                System.out.println("persion instance "+person);
            }
            else if ((person instanceof Person) && (person instanceof Employee)){
                System.out.println("employee instance "+person);
            }
            else if ((person instanceof Person) && (person instanceof Student)){
                System.out.println("student instance "+person);
            }*/
			/*String HQL = "from Employee";
            Query<Employee> query = session.createQuery(HQL, Employee.class);
            List<Employee> employeeList = query.list();*/
            //employeeList.forEach(System.out::println);

            /*String HQL1 = "from Employee e where e.empId=:id";
            Query<Employee> query1 = session.createQuery(HQL1, Employee.class);
            query1.setParameter("id",29);
            List<Employee> employeeList1 = query1.list();*/
            //employeeList1.forEach(System.out::println);

            /*String HQL2 = "select e.name, e.gender, e.salary from Employee e where e.deptName=:dept";
            Query query2 = session.createQuery(HQL2);
            query2.setParameter("dept","IT");
            List<Object[]> list = query2.list();
            for (Object[] objects:list){
                String name = (String) objects[0];
                Character gender = (Character)objects[1];
                Double salary = (Double) objects[2];
                System.out.println("name "+name+" gender "+gender+" salary "+salary);
            }*/
           // list.forEach(k -> System.out.println(k[0]+" and "+k[1]+" and "+k[2]));
            //Query<Employee> query2 = session.createQuery(HQL2, Employee.class);

            String hql = "from Employee e left join fetch e.address where e.empId = :empId";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            query.setParameter("empId", 15);
            Employee employee = query.uniqueResult();
            System.out.println(employee);
            Address address = employee.getAddress();
            System.out.println(address);
            session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	  }
}
