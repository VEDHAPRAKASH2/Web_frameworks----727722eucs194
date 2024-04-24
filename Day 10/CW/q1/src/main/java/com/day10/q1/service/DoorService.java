package com.day10.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day10.q1.model.Door;
import com.day10.q1.repository.DoorRepo;

@Service
public class DoorService {
    @Autowired
    DoorRepo r;

    public Door post(Door d)
    {
        return r.save(d);
    }

    public List<Door> getByColor(String color)
    {
        return r.findByColor(color);
    }

    public Door put(int doorId,String color)
    {
        r.update(doorId,color);
        return r.findDoorById(doorId);
    }

    public String delete(int i)
    {
        r.delete(i);
        return "Door deleted successfully";
    }

    public List<Door> getByType(String type)
    {
        return r.findByType(type);
    }

    public List<Door> getAll()
    {
        return r.findAllDoors();
    }

    public Door getById(int i)
    {
        return r.findDoorById(i);
    }
}
