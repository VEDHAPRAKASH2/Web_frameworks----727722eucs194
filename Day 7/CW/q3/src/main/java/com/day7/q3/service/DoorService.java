package com.day7.q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7.q3.model.Door;
import com.day7.q3.repository.DoorRepo;

@Service
public class DoorService {
    
    @Autowired
    DoorRepo r;

    public Door post(Door d)
    {
        return r.save(d);
    }

    public List<Door> get()
    {
        return r.findAll();
    }

    public Door get(int doorId)
    {
        return r.findByDoorId(doorId);
    }

    public List<Door> get(String accessType)
    {
        return r.findByAccessType(accessType);
    }
}
