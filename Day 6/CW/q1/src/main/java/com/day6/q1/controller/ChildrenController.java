package com.day6.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.day6.q1.model.Children;
import com.day6.q1.service.ChildrenService;

@RestController
public class ChildrenController {
    
    @Autowired
    ChildrenService s;
    
    @PostMapping("/api/children") 
    public Children put(@RequestBody Children c)
    {
        return s.post(c);
    }

    @GetMapping("/api/children/sortBy/{field}")
    public List<Children> ascendingSort(@PathVariable String field)
    {
        return s.ascendingSort(field);
    }
    
    @GetMapping("/api/children/{offset}/{pagesize}") //offest - starting index,pagesize - chidren per page
    public List<Children> disp(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize)
    {
        return s.offsetAndPagesize(offset, pagesize);
    }
    
    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public List<Children> disp1(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize,@PathVariable String field)
    {
        return s.offsetAndPagesizeAndSort(offset, pagesize,field);
    }
    
}
