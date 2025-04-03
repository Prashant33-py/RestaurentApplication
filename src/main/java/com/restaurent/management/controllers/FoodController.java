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

    @GetMapping("/api/getAllFoodItems")
    private ResponseEntity<List<FoodItem>> getAllFoodItems(){
        return ResponseEntity.status(HttpStatus.OK).body(foodItemService.getAllFoodItems());
    }

    @PostMapping("/api/addFoodItem")
    private HttpStatus addFoodItem(@RequestBody FoodItem foodItem){
        System.out.println(foodItem);
        foodItemService.addFoodItem(foodItem);
        return HttpStatus.CREATED;
    }

    @PutMapping("/api/updateFoodItem/{id}")
    private void updateFoodItem(@PathVariable("id") String foodItemId, @RequestBody FoodItem updateFoodItem){
        foodItemService.updateFoodItem(foodItemId, updateFoodItem);
    }
}
