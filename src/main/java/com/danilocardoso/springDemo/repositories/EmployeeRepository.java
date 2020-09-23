package com.danilocardoso.springDemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danilocardoso.springDemo.domains.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
