package com.dnldubinkin.spring.springboot.spring_boot_jpa.dao;




import com.dnldubinkin.spring.springboot.spring_boot_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
