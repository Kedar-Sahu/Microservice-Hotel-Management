package in.main.service;

import java.util.List;

import in.main.entity.Employee;

public interface EmployeeService {

	Employee saveEmp(Employee employee);
	List<Employee> getAllemployee();
	Employee getEmpById(long id);
	boolean deleteEmp(long id);
	//void removeSessionMessage();
}
