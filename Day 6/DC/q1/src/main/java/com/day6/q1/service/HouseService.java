package com.day6.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.q1.model.House;
import com.day6.q1.repository.HouseRepo;

@Service
public class HouseService {
    @Autowired
    HouseRepo r;

    public House post(House h)
    {
        return r.save(h);
    }

    public List<House> get(int offset,int pagesize)
    {
        return r.findAll(PageRequest.of(offset, pagesize)).getContent();
    }

    public List<House> get(int offset,int pagesize,String field)
    {
        return r.findAll(PageRequest.of(offset, pagesize, Sort.by(field))).getContent();
    }
}
