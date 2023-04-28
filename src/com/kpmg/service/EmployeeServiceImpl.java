package com.kpmg.service;

import java.util.HashSet;
import java.util.Set;

import com.kpmg.bean.Employee;

public class EmployeeServiceImpl implements EmployeeRepo {

	//Set<Employee> e= new HashSet<>();
	Employee e = new Employee(1, "Amit", "Java Department");
	Employee e1 = new Employee(2, "vinod", "It Department");
	Employee e2 = new Employee(3, "Sasi", "Managing Department");
	
	Set<Employee> emp= new HashSet<>(Set.of(e, e1, e2));
	
	@Override
	public void createEmp(int id, String name, String edept) {
		// TODO Auto-generated method stub
		Employee employee= new Employee();
		employee.setEmpName(name);
		employee.setEmpId(id);
		employee.setEmpDepartment(edept);
		try
		{
			emp.add(employee);
			System.out.println("Employee Added Successfully");
			
			for(Employee s:emp) {
				System.out.println(s.getEmpId()+" "+s.getEmpName()+" "+s.getEmpDepartment());
			}
		}
		catch (Exception ex) {
			// TODO: handle exception
			System.out.println("Exception message "+ex.getMessage());
		}
		
	}

	@Override
	public void listEmp() {
		// TODO Auto-generated method stub
		for(Employee s:emp) {
			System.out.println(s.getEmpId()+" "+s.getEmpName()+" "+s.getEmpDepartment());
		}
	}
	

	@Override
	public void updateEmp(int id, String name) {
		// TODO Auto-generated method stub
		
		
		for(Employee e:emp) {
			if(e.getEmpId()==id) {
				Employee emp1= new Employee(id, name, e.getEmpDepartment());
				emp.remove(e);
				emp.add(emp1);
				
				System.out.println("employee Updated Successfully");
				
				
			}
			
		}
		for(Employee s:emp) {
			System.out.println(s.getEmpId()+" "+s.getEmpName()+" "+s.getEmpDepartment());
		}
		
		
	}

	@Override
	public void removeEmp(int id) {
		// TODO Auto-generated method stub
		
		for(Employee e:emp) {
			if(e.getEmpId()==id) {
				emp.remove(e);
				
				System.out.println("employee Removed Successfully");
			}
		}
		for(Employee s:emp) {
			System.out.println(s.getEmpId()+" "+s.getEmpName()+" "+s.getEmpDepartment());
		}
		
	}

}
