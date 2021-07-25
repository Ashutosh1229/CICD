package management.management.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import management.management.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long>{
	

}
