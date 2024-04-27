package com.day12.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.day12.q1.model.Address;
import com.day12.q1.model.Employee;
import com.day12.q1.repository.EmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo r;
    
    private EntityManager entityManager;

    public EmployeeService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Employee post(@RequestBody Employee e)
    {
        return r.save(e);
    }
    
    public List<Employee> innerjoin()
    {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);

        Root<Employee> employeeRoot = criteriaQuery.from(Employee.class);
        Join<Employee, Address> addressJoin = employeeRoot.join("address",JoinType.INNER);

        criteriaQuery.select(employeeRoot);

        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public List<Employee> leftjoin() 
    {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);

        Root<Employee> employeeRoot = criteriaQuery.from(Employee.class);
        Join<Employee, Address> addressJoin = employeeRoot.join("address", JoinType.LEFT);

        criteriaQuery.select(employeeRoot);

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
