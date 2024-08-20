package com.sp.college_service.controller;

import com.sp.college_service.model.College;
import com.sp.college_service.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api1/college")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;
    @PostMapping
    public College addCollege(@RequestBody College college)
    {
        return collegeService.addCollege(college);
    }
    @GetMapping("/{id}")
    public College getCollege(@PathVariable int id)
    {
        return collegeService.getCollege(id);
    }

    @GetMapping
    public List<College> getAllCollege()
    {
        return collegeService.getAllCollege();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCollege(@PathVariable int id)
    {
        return collegeService.deleteCollege(id);
    }
    @PutMapping("/{id}")
    public College updateCollege(@PathVariable int id,@RequestBody College college)
    {
        return collegeService.updateCollege(id,college);
    }
}
