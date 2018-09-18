package client;

import entities.Address;
import entities.Employee;
import org.hibernate.Session;
import utility.HibernateUtil;

import java.util.Date;

public class MergeDataEmployeeTest {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();Address address1 = new Address();
            address1.setCity("Chennai");
            address1.setPincode(9087727L);
            address1.setState("Tamilnadu");
            address1.setStreet("Park Street");

            Employee employee1 = new Employee();
            employee1.setEmployeeName("sean Bingel");
            employee1.setEmail("sean.cs2017@gmail.com");
            employee1.setSalary(60000L);
            employee1.setDoj(new Date());

            Address address1 = new Address();
            address1.setCity("Chennai");
            address1.setPincode(9087727L);
            address1.setState("Tamilnadu");
            address1.setStreet("Park Street");
            employee1.setAddress(address1);
            session.persist(employee1);

            session.getTransaction().commit();
        }
    }
}
