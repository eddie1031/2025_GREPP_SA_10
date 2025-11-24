package com.example.demo.model;

public record CuisineRecommendationRequest(
        String language,
        int amount,
        String country
) {
}
