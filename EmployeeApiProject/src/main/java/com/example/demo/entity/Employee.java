package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

@Entity
public class Employee {
	@Id
	@GeneratedValue(generator = "seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name="seq", initialValue = 1000)
	private Integer empId;
	@NotNull(message="Employee cannot be null")
	@NotBlank(message="Employee name cannot be blank")
	private String empName;
	private Double empSalary;
	
	@Column(unique = true)
	@Email
	private String empEmailId;
	@Range(min = 21, message = "Employee age cannot be less than 21 years")
	private Integer empAge;
	@Column(unique = true)
	@Length(min=10, max=13, message="Cell number cannot be less than 10 characters")
	private String empCellNo;
	@Length(min=3, message="Address cannot be less than 3 characters")
	
	private String empAddress;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId,
			@NotNull(message = "Employee cannot be null") @NotBlank(message = "Employee name cannot be blank") String empName,
			Double empSalary, @Email String empEmailId,
			@Range(min = 21, message = "Employee age cannot be less than 21 years") Integer empAge,
			@Length(min = 10, max = 13, message = "Cell number cannot be less than 10 characters") String empCellNo,
			@Length(min = 3, message = "Address cannot be less than 3 characters") String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empEmailId = empEmailId;
		this.empAge = empAge;
		this.empCellNo = empCellNo;
		this.empAddress = empAddress;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public Integer getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
	public String getEmpCellNo() {
		return empCellNo;
	}
	public void setEmpCellNo(String empCellNo) {
		this.empCellNo = empCellNo;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empEmailId="
				+ empEmailId + ", empAge=" + empAge + ", empCellNo=" + empCellNo + ", empAddress=" + empAddress + "]";
	}
	
	
	

	
}
