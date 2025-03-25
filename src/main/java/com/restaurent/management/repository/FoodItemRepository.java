package com.restaurent.management.repository;

import com.restaurent.management.model.FoodItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends MongoRepository<FoodItem, Integer> {
}
