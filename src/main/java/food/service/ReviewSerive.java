package food.service;

import java.util.List;

import food.Exception.ReviewException;
import food.model.Review;
import food.model.User;
import food.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
