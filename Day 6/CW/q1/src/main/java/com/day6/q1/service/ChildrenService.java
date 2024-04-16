package com.day6.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.day6.q1.model.Children;
import com.day6.q1.repository.ChildrenRepo;

@Service
public class ChildrenService {
    @Autowired
    ChildrenRepo r;

    public Children post(Children c)
    {
        return r.save(c);
    }

    public List<Children> ascendingSort(String field)
    {
        Pageable p1 = PageRequest.of(0,r.findAll().size(),Sort.by(field));
        return r.findAll(p1).getContent();
    }
    
    public List<Children> offsetAndPagesize(int offset,int pagesize)
    {
        Pageable p1 = PageRequest.of(offset,pagesize);
        return r.findAll(p1).getContent();
    }
    
    public List<Children> offsetAndPagesizeAndSort(int offset,int pagesize,String field)
    {
        Pageable p1 = PageRequest.of(offset,pagesize,Sort.by(field) );
        return r.findAll(p1).getContent();
    }
}
