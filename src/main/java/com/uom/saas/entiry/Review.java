package com.uom.saas.entiry;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("reviews")
public class Review {
    @Id
    private int id;
    String review;
    String reviewerName;
    String rating;

    public Review(int id, String review, String reviewerName, String rating) {
        this.id = id;
        this.review = review;
        this.reviewerName = reviewerName;
        this.rating = rating;
    }
    public int getId() {
        return id;
    }

    public String getReview() {
        return review;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public String getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
