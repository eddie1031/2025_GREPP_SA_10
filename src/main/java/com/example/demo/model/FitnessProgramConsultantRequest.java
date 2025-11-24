package com.example.demo.model;

public record FitnessProgramConsultantRequest(
        String targetPart,
        String height,
        String weight,
        String workoutExpMonth
) {
}
