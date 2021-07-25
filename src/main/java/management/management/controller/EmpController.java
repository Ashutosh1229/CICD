package management.management.controller;

import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import management.management.exception.ResourceNotFoundException;
import management.management.model.Employee;
import management.management.repo.EmpRepository;

@RestController
public class EmpController {
	
	@Autowired
	EmpRepository empRepository;
	
	@PostMapping("/EmpSave")
	public String insert(@RequestBody Employee employee) {
		empRepository.save(employee);
		return "Record saved successfully";
		
	}
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		return (List<Employee>) empRepository.findAll();
		
	}
	
	@PutMapping("/update/{empCode}")
    public ResponseEntity < Employee > updateEmployee(@PathVariable(value = "empCode") Long empCode,
        @Validated @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = empRepository.findById(empCode)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + empCode));

        employee.setEmail(employeeDetails.getEmail());
        employee.setLoc(employeeDetails.getLoc());
        employee.setEmpName(employeeDetails.getEmpName());
        employee.setDate(employeeDetails.getDate());
        final Employee updatedEmployee = empRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }
	

}
