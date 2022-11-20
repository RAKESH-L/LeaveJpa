package com.sample.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.jpa.entity.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Integer>{

	@Modifying
	@Query(value="UPDATE LEAVE1 SET STATUS = :status WHERE LEAVEID = :id", nativeQuery = true)
	public int updateEmployeeLeaveStatus(@Param("id") Long id, @Param("status") String status);
	
}
