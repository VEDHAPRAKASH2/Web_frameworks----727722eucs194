package com.day9.q3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day9.q3.model.Village;

public interface VillageRepo extends JpaRepository<Village,Integer>{
    @Query("SELECT v from Village v where v.villageName = ?1")
    Village findByVillageName(String villageName);
    @Query("SELECT v from Village v where v.villagePopulation = ?1")
    List<Village> findByVillagePopulation(int villagePopulation);
    @Query("SELECT v from Village v where v.villageId = ?1")
    Village findByVillageId(int villageId);
}
