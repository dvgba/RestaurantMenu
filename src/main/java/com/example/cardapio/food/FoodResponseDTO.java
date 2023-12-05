package com.example.cardapio.food;

public record FoodResponseDTO(Long id, String title, String subtitle, String image, Integer price) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getSubtitle(), food.getImage(), food.getPrice());
    }
}
    

