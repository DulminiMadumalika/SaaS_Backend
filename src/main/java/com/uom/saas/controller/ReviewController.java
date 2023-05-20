package com.uom.saas.controller;
import com.uom.saas.entiry.Review;
import com.uom.saas.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping(value = "/addReview", produces = "application/json")
    public ResponseEntity<Map<String, Object>> addReview(@RequestBody Review review) {
        String response = reviewService.addReview(review);
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("message", "Added review with id: " + response);
        return ResponseEntity.ok(responseBody);
    }


    @GetMapping("/getAllReviews")
    public List<Review> getAllReviews() {
        List<Review> allReviews = reviewService.getAllReviews();
        return allReviews;

    }
}
