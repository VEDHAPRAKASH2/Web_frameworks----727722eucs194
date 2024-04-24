package com.day7.q3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day7.q3.model.Door;

public interface DoorRepo extends JpaRepository<Door,Integer>{
    @Query("Select d from Door d where d.doorId = ?1")
    Door findByDoorId(int doorId);
    @Query("Select d from Door d where d.accessType = ?1")
    List<Door> findByAccessType(String accessType);
}
