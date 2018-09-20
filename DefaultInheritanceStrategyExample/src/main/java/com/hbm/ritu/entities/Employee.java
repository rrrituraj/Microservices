package com.hbm.ritu.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="employee_table")
//@DiscriminatorValue(value = "Employee_Type")
public class Employee{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int empId;

	@Column(name = "emp_name",nullable = false)
	private String name;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Column(name = "gender",nullable = false)
	private char gender;

	@Column(name="salary",columnDefinition="DECIMAL(8,2)")
	private Double salary;
	
	@Column(name="date_of_joining")
	private Date doj;
	
	@Column(name="dept_name",length=30)
	private String deptName;
	
	@Column(name="bonus",precision=6,scale=3)
	private BigDecimal bonus;
	
	@Column(name="email",length=30,unique=false)
	private String email;
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}
	public BigDecimal getBonus() {
		return bonus;
	}

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", doj=" + doj +
                ", deptName='" + deptName + '\'' +
                ", bonus=" + bonus +
                ", email='" + email + '\'' +
                '}';
    }
}
