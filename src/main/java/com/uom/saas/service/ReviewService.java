package com.uom.saas.service;
import com.uom.saas.entiry.Review;
import com.uom.saas.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    public String addReview(Review review) {
        reviewRepository.save(review);
        return "Added review with id : " + review.getId();
    }
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
