package com.day12.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day12.q1.model.*;
import com.day12.q1.repository.DriverRepository;
import com.day12.q1.repository.LicenseRepository;

@Service
public class LicenseService {
    @Autowired
    LicenseRepository r;
    @Autowired
    DriverRepository rep;


    public Driver post(License l,int id)
    {
        Driver d = rep.findById(id);
        d.setLicense(l);
        return rep.save(d);
    }
}
