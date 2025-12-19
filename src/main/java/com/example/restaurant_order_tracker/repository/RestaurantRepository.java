package com.example.restaurant_order_tracker.repository;

import org.springframework.stereotype.Repository;
import com.example.restaurant_order_tracker.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

}
