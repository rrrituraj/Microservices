package service;

import entities.Employee;

public interface EmployeeService {
    public abstract void createEmployee(Employee employee);
    public abstract Employee  getEmployeebyId(int employeeId);
    public abstract void updateEmployeeById(int employeeId,Long newSal);
    public abstract void  deleteEmployeeById(Integer employeeId);
}
