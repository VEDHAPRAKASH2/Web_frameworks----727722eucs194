package com.day9.q3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day9.q3.model.Village;
import com.day9.q3.repository.VillageRepo;

@Service
public class VillageService {
    @Autowired
    VillageRepo r;

    public Village post(Village v)
    {
        return r.save(v);
    }

    public Village getById(int villageId)
    {
        return r.findByVillageId(villageId);
    }

    public Village getByName(String villageName)
    {
        return r.findByVillageName(villageName);
    }

    public List<Village> getByPopulation(int villagePopulation)
    {
        return r.findByVillagePopulation(villagePopulation);
    }
}
