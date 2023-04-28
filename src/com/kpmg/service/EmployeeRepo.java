package com.kpmg.service;

public interface EmployeeRepo {

	void createEmp(int id,String name,String edept);
	void listEmp();
	void updateEmp(int id,String name);
	void removeEmp(int id);
	
}
