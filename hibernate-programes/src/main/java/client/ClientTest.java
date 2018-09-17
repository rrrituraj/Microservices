package client;

import entities.Address;
import entities.Employee;
import service.EmployeeService;
import service.Impl.EmployeeServiceImpl;

import java.util.Date;

public class ClientTest {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        createEmployee(employeeService);
        //getEmployeebyId(employeeService);
        //updateEmployeeById(employeeService);
        //deleteEmployeeById(employeeService);
    }

    private static void deleteEmployeeById(EmployeeService employeeService) {
        employeeService.deleteEmployeeById(1);
    }

    private static void updateEmployeeById(EmployeeService employeeService) {
        employeeService.updateEmployeeById(1, 60000l);
    }

    private static void getEmployeebyId(EmployeeService employeeService) {
        Employee employee = employeeService.getEmployeebyId(1);
        System.out.println(employee);
    }

    private static void createEmployee(EmployeeService employeeService) {
        employeeService.createEmployee(getEmployee());
    }

    private static Employee getEmployee(){
        Employee employee= new Employee();
        employee.setEmployeeName("Martin Bingel");
        employee.setEmail("martin.cs2017@gmail.com");
        employee.setSalary(50000L);
        employee.setDoj(new Date());

        Address homeAddress = new Address();
        homeAddress.setCity("Chennai");
        homeAddress.setPincode(9087727L);
        homeAddress.setState("Tamilnadu");
        homeAddress.setStreet("Park Street");
        //employee.setHomeAddress(homeAddress);

        Address officeAddress = new Address();
        officeAddress.setCity("Pune");
        officeAddress.setPincode(9087727L);
        officeAddress.setState("Maharashtra");
        officeAddress.setStreet("Park Street");
        //employee.setOfficeAddress(officeAddress);

        //employee.setAddress(officeAddress);
        employee.getAddressList().add(homeAddress);
        employee.getAddressList().add(officeAddress);
        return employee;
    }
}
