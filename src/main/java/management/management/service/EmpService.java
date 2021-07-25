package management.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import management.management.model.Employee;
import management.management.repo.EmpRepository;


@Service
public class EmpService {
	
	@Autowired
	static
	private EmpRepository empRepository;
	
	public static List<Employee> listAll() {
		return empRepository.findAll();
	}
	
	public void save(Employee employee)
	{
		empRepository.save(employee);
	}
	
	public Employee get(long id) {
		return empRepository.findById(id).get();
	}
	
	public void delete(long id) {
		empRepository.deleteById(id);
	}
	
}
