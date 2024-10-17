package in.main.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import in.main.entity.Employee;
import in.main.repository.EmployeeRepository;
import in.main.service.EmployeeService;
import jakarta.servlet.http.HttpSession;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveEmp(Employee employee) {
		Employee emp=employeeRepository.save(employee);
		
		return emp;
	}

	@Override
	public List<Employee> getAllemployee() {
		List<Employee> listEmp=employeeRepository.findAll();
		return listEmp;
	}

	@Override
	public Employee getEmpById(long id) {
		Employee emp=employeeRepository.findById(id).get();
		return emp;
	}

	@Override
	public boolean deleteEmp(long id) {
		Employee emp=employeeRepository.findById(id).get();
		if(emp!=null) {
			employeeRepository.delete(emp);
			return true;
		}
		return false;
	}

	
	public void removeSessionMessage() {
		
		HttpSession session=((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
		session.removeAttribute("msg");
	}

}
