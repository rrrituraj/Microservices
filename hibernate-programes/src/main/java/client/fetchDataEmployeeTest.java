package client;

import entities.Address;
import entities.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import service.EmployeeService;
import service.Impl.EmployeeServiceImpl;
import utility.HibernateUtil;

import java.util.Date;

public class fetchDataEmployeeTest {
    public static void main(String[] args) {
        Employee employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employee = session.get(Employee.class, 2);
            System.out.println(employee);
            if (employee != null) {
                employee.getAddressList().forEach(System.out::println);
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }
}
