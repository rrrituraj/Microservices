package dao;

import entities.Employee;

public interface EmployeeDao {
    void addEmployee(Employee employee);
    Employee fetchEmployeeById(int employeeId);
    void updateEmployeeById(int employeeId,Long newSal);
    void  deleteEmployeeById(Integer employeeId);
}
