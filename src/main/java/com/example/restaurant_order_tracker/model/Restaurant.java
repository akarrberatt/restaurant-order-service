package com.example.restaurant_order_tracker.model;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "restaurants")
@Data
public class Restaurant {
    @Id
    private String id;

    @NotBlank(message = "Restoran ismi boş olamaz")
    private String name;

    private String category;

    @Min(value = 0, message = "Puan 0'dan küçük olamaz")
    @Max(value = 5, message = "Puan 5'ten büyük olamaz")
    private double rating;

    private boolean isOpen;
}