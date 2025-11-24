package com.example.demo.model;

import java.util.List;

public record CuisineRecommendationResponse(
        String country,
        List<String> cuisines
) {
}
