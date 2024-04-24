package com.day9.q2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.day9.q2.model.Recipe;

public interface RecipeRepo extends JpaRepository<Recipe,Integer>{
    @Query("SELECT r from Recipe r where r.recipeId = ?1")
    Recipe findByRecipeId(int i);

    @Query("SELECT r from Recipe r where r.recipeName = ?1")
    List<Recipe> findByRecipeName(String i);
}
