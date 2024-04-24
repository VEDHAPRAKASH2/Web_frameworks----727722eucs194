package com.day9.q2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day9.q2.model.Recipe;
import com.day9.q2.repository.RecipeRepo;

@Service
public class RecipeService {
    @Autowired 
    RecipeRepo r;

    public Recipe post(Recipe rec)
    {
        return r.save(rec);
    }

    public Recipe get(int i)
    {
        return r.findByRecipeId(i);
    }

    public List<Recipe> get(String i)
    {
        return r.findByRecipeName(i);
    }
}
