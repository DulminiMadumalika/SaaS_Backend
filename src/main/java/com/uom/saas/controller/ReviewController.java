package com.uom.saas.controller;
import com.uom.saas.entiry.Review;
import com.uom.saas.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/addReview")
    public String addReview(@RequestBody Review review) {
        String response = reviewService.addReview(review);
        return response;
    }

    @GetMapping("/getAllReviews")
    public List<Review> getAllReviews() {
        List<Review> allReviews = reviewService.getAllReviews();
        return allReviews;

    }
}
