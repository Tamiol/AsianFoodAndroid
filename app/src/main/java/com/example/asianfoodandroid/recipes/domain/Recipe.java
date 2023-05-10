package com.example.asianfoodandroid.recipes.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String name;
    private Set<Ingredient> ingredients = new HashSet<>();
    private int readyInMinutes;
    private String instructions;
    private Boolean vegetarian;
    private Boolean vegan;
    private Boolean glutenFree;

    public Recipe(String name, Set<Ingredient> ingredients, int readyInMinutes, String instructions, Boolean vegetarian, Boolean vegan, Boolean glutenFree) {
        this.name = name;
        this.ingredients = ingredients;
        this.readyInMinutes = readyInMinutes;
        this.instructions = instructions;
        this.vegetarian = vegetarian;
        this.vegan = vegan;
        this.glutenFree = glutenFree;
    }

    public String getName() {
        return name;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public String getInstructions() {
        return instructions;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return readyInMinutes == recipe.readyInMinutes && Objects.equals(name, recipe.name) && Objects.equals(ingredients, recipe.ingredients) && Objects.equals(instructions, recipe.instructions) && Objects.equals(vegetarian, recipe.vegetarian) && Objects.equals(vegan, recipe.vegan) && Objects.equals(glutenFree, recipe.glutenFree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ingredients, readyInMinutes, instructions, vegetarian, vegan, glutenFree);
    }
}
