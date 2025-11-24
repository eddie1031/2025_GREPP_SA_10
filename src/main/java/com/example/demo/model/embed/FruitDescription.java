package com.example.demo.model.embed;

public record FruitDescription(
        String name,
        String description,
        int sweetness,
        int softness,
        String season
) {
}
