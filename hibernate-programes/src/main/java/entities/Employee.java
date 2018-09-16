package entities;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="employee_table")
@DynamicUpdate
public class Employee {
	@Id
	@Column(name="employee_id")
	/*@GeneratedValue(strategy=GenerationType.AUTO, generator = "empId_generator")
	@SequenceGenerator(name = "empId_generator", initialValue = 2,allocationSize = 2,sequenceName = "empId_seq")*/
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "empId_generator")
    @SequenceGenerator(name = "empId_generator", initialValue = 2,allocationSize = 2,sequenceName = "empId_seq")
	private Integer employeeId;
	
	@Column(name="employee_name",length=100,nullable=false)
	private String employeeName;
	
	@Column(name="email",length=50)
	private String email;
	
	@Column(name="date_of_joing")
	private Date doj;
	
	@Column(name="salary")
	private Long salary;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", doj="
				+ doj + ", salary=" + salary + "]";
	}
	
}
