package com.day7.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day7.q1.model.Car;

public interface CarRepo extends JpaRepository<Car,Integer>{
    @Query("SELECT c from Car c")
    List<Car> findAllCars();

    @Query("SELECT distinct c from Car c where c.address=?1 and c.currentOwnerName=?2")
    Car findByAddressAndOwner(String address, String currentOwnerName);
}