package com.example.demo.model.embed;

import java.util.List;

public record KboQna(
        String id,
        String category,
        String question,
        String answer,
        List<String> keywords
) {
}
