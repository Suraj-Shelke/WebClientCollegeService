package com.sp.college_service.dao;

import com.sp.college_service.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer> {
}
