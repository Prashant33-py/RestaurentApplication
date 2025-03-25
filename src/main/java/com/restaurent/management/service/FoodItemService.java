package com.restaurent.management.service;

import com.restaurent.management.model.FoodItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodItemService {
    public List<FoodItem> getAllFoodItems();
}
