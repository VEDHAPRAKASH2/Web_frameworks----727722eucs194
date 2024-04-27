package com.day12.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day12.q1.model.Driver;
import com.day12.q1.model.License;
import com.day12.q1.repository.DriverRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

@Service
public class DriverService {
    @Autowired
    DriverRepository r;

    EntityManager entityManager;

    public DriverService(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    public Driver post(Driver d)
    {
        return r.save(d);
    }

    public List<Driver> getAllDriver()
    {
        return r.findAll();
    }

    public Driver getDriver(int id)
    {
        return r.findById(id);
    }

    public Driver updateDriver(Driver d,int id)
    {
        Driver dri = r.findById(id);
        dri.setAge(d.getAge());
        dri.setName(d.getName());
        return r.save(dri);
    }

    public List<Driver> leftjoin()
    {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Driver> criteriaQuery = criteriaBuilder.createQuery(Driver.class);

        Root<Driver> driverRoot = criteriaQuery.from(Driver.class);
        Join<Driver, License> licenseJoin = driverRoot.join("license", JoinType.LEFT);

        criteriaQuery.select(driverRoot);

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
