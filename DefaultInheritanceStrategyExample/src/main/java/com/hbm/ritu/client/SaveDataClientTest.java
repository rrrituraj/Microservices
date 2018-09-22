package com.hbm.ritu.client;

import java.math.BigDecimal;
import java.text.ParseException;

import com.hbm.ritu.entities.Address;
import com.hbm.ritu.entities.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hbm.ritu.entities.Person;
import com.hbm.ritu.entities.Student;
import com.hbm.ritu.util.HibernateUtil;

public class SaveDataClientTest {

	public static void main(String[] args) throws ParseException {
	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {

	    	/*Person person = new Person();
			person.setName("choosa");
			person.setGender("Female");*/


            Address address = new Address();
            // address.setEmployee(employee);
            address.setCity("Bhopal");
            address.setPincode(232106L);
            address.setState("Madhya Pradesh");
            address.setStreet("Gali muhalla");

            Address address1 = new Address();
            // address1.setEmployee(employee1);
            address1.setCity("Lucknow");
            address1.setPincode(232106L);
            address1.setState("Uttar Pradesh");
            address1.setStreet("Shaam - e - Awadh");

            Address address2 = new Address();
            // address2.setEmployee(employee2);
            address2.setCity("Banaras");
            address2.setPincode(232101L);
            address2.setState("Uttar Pradesh");
            address2.setStreet("Subah - e - Banaras");

			Employee employee = new Employee();
			employee.setBonus(new BigDecimal("277.389"));
			employee.setDeptName("IT");
			employee.setDoj(HibernateUtil.getDoj("18/12/2015"));
			employee.setEmail("deepak.cs@gmail.com");
			employee.setName("Deepak");
			employee.setSalary(80000.28);
			employee.setGender('M');
			employee.setAddress(address);
            Employee employee1 = new Employee();
            employee1.setBonus(new BigDecimal("277.389"));
            employee1.setDeptName("CS");
            employee1.setDoj(HibernateUtil.getDoj("18/12/2015"));
            employee1.setEmail("bhodu.cs@gmail.com");
            employee1.setName("BhoduRam");
            employee1.setSalary(8000.22);
            employee1.setGender('M');
            employee1.setAddress(address1);
            Employee employee2 = new Employee();
            employee2.setBonus(new BigDecimal("277.389"));
            employee2.setDeptName("ME");
            employee2.setDoj(HibernateUtil.getDoj("18/12/2015"));
            employee2.setEmail("Kaalu.cs@gmail.com");
            employee2.setName("KaaluMama");
            employee2.setSalary(800000.28);
            employee2.setGender('M');
            employee2.setAddress(address2);

			/*Student student = new Student();
			student.setName("Shuruti");
			student.setGender("Female");
			student.setFee(20000.00f);
			student.setSchoolName("DPS");
			student.setSectionName("12th Std");*/
			/*session.save(person);
			session.save(student);*/
            session.beginTransaction();
			session.persist(employee1);
			session.persist(employee);
			session.persist(employee2);

			session.getTransaction().commit();
			//session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	  }
}
