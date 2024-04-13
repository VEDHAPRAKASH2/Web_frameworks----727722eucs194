package com.day4.q1.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.q1.model.Medicine;
import com.day4.q1.repository.MedicineRepo;

@Service
public class MedicineService {

    @Autowired
    MedicineRepo r;

    public List<Medicine> getAllMedicines()
    {
        return r.findAll();
    }

    public Optional<Medicine> getMedicine(int i)
    {
        return r.findById(i);
    }

    public Medicine putMedicine(Medicine s)
    {
        Medicine abc = r.save(s);
        return abc;
    }
}
