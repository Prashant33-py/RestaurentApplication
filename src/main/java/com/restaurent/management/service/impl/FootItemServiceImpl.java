package com.restaurent.management.service.impl;

import com.restaurent.management.model.FoodItem;
import com.restaurent.management.service.FoodItemService;

import java.util.ArrayList;
import java.util.List;

public class FootItemServiceImpl implements FoodItemService {

    private List<FoodItem> foodItems = new ArrayList<>();

    @Override
    public List<FoodItem> getAllFoodItems() {
        foodItems.add(new FoodItem(1,"Rice","This is rice", List.of("Rice","water"),60));
        foodItems.add(new FoodItem(2,"Dal","This is dal", List.of("Dal", "Water"),50));
        foodItems.add(new FoodItem(3,"Fish","This is fish", List.of("Fish", "salt"),200));
        return foodItems;
    }
}
