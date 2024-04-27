package com.day7.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day7.q1.model.Car;
import com.day7.q1.repository.CarRepo;

@Service
public class CarService {
    @Autowired
    CarRepo r;

    public Car post(Car c)
    {
        return r.save(c);
    }

    public List<Car> getAllCars()
    {
        return r.findAllCars();
    }

    public Car getByAddressAndOwner(String address, String currentOwnerName)
    {
        return r.findByAddressAndOwner(address, currentOwnerName);
    }
}
