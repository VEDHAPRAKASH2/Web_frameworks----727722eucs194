package com.day10.q1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.day10.q1.model.Door;

import jakarta.transaction.Transactional;

public interface DoorRepo extends JpaRepository<Door,Integer>{
    @Query("SELECT d from Door d")
    List<Door> findAllDoors();
    
    @Query("SELECT d from Door d where d.doorId = ?1")
    Door findDoorById(int doorId);

    @Query("SELECT d from Door d where d.color = ?1")
    List<Door> findByColor(String color);
    
    @Query("SELECT d from Door d where d.doorType = ?1")
    List<Door> findByType(String type);
    
    @Modifying
    @Transactional
    @Query("Update Door d SET d.color = ?2 where d.doorId = ?1")
    void update(int doorId,String color);
    
    @Modifying
    @Transactional
    @Query("DELETE from Door d where d.doorId = ?1")
    void delete(int doorId);
}
