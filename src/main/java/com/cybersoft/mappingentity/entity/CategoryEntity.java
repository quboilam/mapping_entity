package com.cybersoft.mappingentity.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "image")
    private String image;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "categoryEntity")
    private Set<FoodEntity> foodEntities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<FoodEntity> getFoodEntities() {
        return foodEntities;
    }

    public void setFoodEntities(Set<FoodEntity> foodEntities) {
        this.foodEntities = foodEntities;
    }
}
