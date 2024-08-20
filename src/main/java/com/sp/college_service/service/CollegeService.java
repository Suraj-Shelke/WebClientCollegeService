package com.sp.college_service.service;

import com.sp.college_service.dao.CollegeRepository;
import com.sp.college_service.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    private CollegeRepository collegeRepository;

    public College addCollege(College college)
    {
        return collegeRepository.save(college);
    }
    public  College getCollege(int id)
    {
        return collegeRepository.findById(id).orElseThrow(()->new RuntimeException("college does not exist.."));
    }
    public List<College> getAllCollege()
    {
        return collegeRepository.findAll();
    }
    public ResponseEntity<HttpStatus> deleteCollege(int id)
    {
        College college=collegeRepository.findById(id).orElseThrow(()->new RuntimeException("college does not exist for delete.."));

        collegeRepository.delete(college);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    public College updateCollege(int id , College college)
    {
        College updateCollege=collegeRepository.findById(id).orElseThrow(()->new RuntimeException("college does not exist to update it.."));
        updateCollege.setClgName(college.getClgName());
        updateCollege.setClgCode(college.getClgCode());
        updateCollege.setCity(college.getCity());
        return collegeRepository.save(updateCollege);
    }

}
