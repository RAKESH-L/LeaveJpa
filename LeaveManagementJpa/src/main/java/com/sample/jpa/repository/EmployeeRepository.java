package com.sample.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sample.jpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findById(int id);

	@Modifying
	@Query(value="DELETE FROM EMPLOYEE WHERE ID = :id", nativeQuery = true)
	void deleteById(int id);


	

	

}
