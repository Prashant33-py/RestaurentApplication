package com.restaurent.management.controllers;

import com.restaurent.management.model.FoodItem;
import com.restaurent.management.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping("/api")
    private List<FoodItem> getAllFoodItems(){
        return foodItemService.getAllFoodItems();
    }

    @PostMapping("/api")
    private void addFoodItem(@RequestBody FoodItem foodItem){
        System.out.println(foodItem.toString());
        foodItemService.addFoodItem(foodItem);
    }
}
