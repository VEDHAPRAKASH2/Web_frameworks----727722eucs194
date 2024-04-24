package com.day9.q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.day9.q2.model.Recipe;
import com.day9.q2.service.RecipeService;

@RestController
public class RecipeController {
    @Autowired
    RecipeService ser;

    @PostMapping("/api/recipe")
    public Recipe post(@RequestBody Recipe r)
    {
        return ser.post(r);
    }

    @GetMapping("/api/recipe/byname")
    public List<Recipe> getByName(@RequestParam("recipeName") String recipeName)
    {
        return ser.get(recipeName);
    }

    @GetMapping("/api/recipe/{recipeId}")
    public Recipe getByName(@PathVariable("recipeId") int recipeId)
    {
        return ser.get(recipeId);
    }
}