package com.day12.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day12.q2.model.Student;
import com.day12.q2.model.StudentDetail;
import com.day12.q2.repository.StudentRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

@Service
public class StudentService {
    @Autowired
    StudentRepo r;

    private EntityManager entityManager;

    public StudentService(EntityManager entityManager) 
    {
        this.entityManager = entityManager;
    }

    public Student post(Student s)
    {
        return r.save(s);
    }

    public List<Student> innerjoin()
    {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);

        Root<Student> studentRoot = criteriaQuery.from(Student.class);
        Join<Student, StudentDetail> studentJoin = studentRoot.join("studentDetail",JoinType.INNER);

        criteriaQuery.select(studentRoot);

        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public List<Student> leftjoin()
    {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);

        Root<Student> studentRoot = criteriaQuery.from(Student.class);
        Join<Student, StudentDetail> studentJoin = studentRoot.join("studentDetail",JoinType.LEFT);

        criteriaQuery.select(studentRoot);

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
