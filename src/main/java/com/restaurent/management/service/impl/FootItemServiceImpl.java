package com.restaurent.management.service.impl;

import com.restaurent.management.model.FoodItem;
import com.restaurent.management.repository.FoodItemRepository;
import com.restaurent.management.service.FoodItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FootItemServiceImpl implements FoodItemService {


    @Autowired
    private FoodItemRepository foodItemRepository;

    @Override
    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    @Override
    public void addFoodItems(List<FoodItem> newFoodItems) {
        foodItemRepository.saveAll(newFoodItems);
    }

    @Override
    public void addFoodItem(FoodItem newFoodItem) {
        foodItemRepository.save(newFoodItem);
    }

    @Override
    public FoodItem getFoodItemByName(String name) {
        return foodItemRepository.findFoodItemByName(name);
    }
}
