package com.restaurent.management.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@Document("FoodItem")
public class FoodItem {
    @Id
    private String name;
    private String description;
    private List<String> ingredients;
    private int price;

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                ", price=" + price +
                '}';
    }
}
