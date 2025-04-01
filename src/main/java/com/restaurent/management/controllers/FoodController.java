package com.restaurent.management.controllers;

import com.restaurent.management.model.FoodItem;
import com.restaurent.management.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class FoodController {

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping("/api")
    private ResponseEntity<List<FoodItem>> getAllFoodItems(){
        return ResponseEntity.status(HttpStatus.OK).body(foodItemService.getAllFoodItems());
    }

    @PostMapping("/api")
    private void addFoodItem(@RequestBody FoodItem foodItem){
        foodItemService.addFoodItem(foodItem);
    }
}
