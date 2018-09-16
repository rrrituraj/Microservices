package service.Impl;

import dao.Impl.EmployeeDaoImpl;
import entities.Employee;
import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void createEmployee(Employee employee) {
        new EmployeeDaoImpl().addEmployee(employee);
    }

    @Override
    public Employee getEmployeebyId(int employeeId) {
        return new EmployeeDaoImpl().fetchEmployeeById(employeeId);
    }

    @Override
    public void updateEmployeeById(int employeeId, Long newSal) {
        new EmployeeDaoImpl().updateEmployeeById(employeeId, newSal);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        new EmployeeDaoImpl().deleteEmployeeById(employeeId);
    }

}
