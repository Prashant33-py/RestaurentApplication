package com.restaurent.management.controllers;

import com.restaurent.management.model.FoodItem;
import com.restaurent.management.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping("/api")
    private List<FoodItem> getHello(){
        return foodItemService.getAllFoodItems();
    }
}
