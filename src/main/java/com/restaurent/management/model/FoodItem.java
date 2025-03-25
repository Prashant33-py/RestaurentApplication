package com.restaurent.management.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class FoodItem {
    public FoodItem(int price, String name, List<String> ingredients, int id, String description) {
        this.price = price;
        this.name = name;
        this.ingredients = ingredients;
        this.id = id;
        this.description = description;
    }

    //    @Id
    private int id;
    private String name;
    private String description;
    private List<String> ingredients;
    private int price;

}
