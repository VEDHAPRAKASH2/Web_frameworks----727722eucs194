package com.day6.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.q2.model.Student;
import com.day6.q2.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo r;

    public Student post(Student s)
    {
        return r.save(s);
    }

    public List<Student> get(int pageNo,int pageSize)
    {
        return r.findAll(PageRequest.of(pageNo, pageSize)).getContent();
    }

    public List<Student> getAndSort(int pageNo,int pageSize,String sortBy)
    {
        return r.findAll(PageRequest.of(pageNo, pageSize, Sort.by(sortBy))).getContent();
    }
}
