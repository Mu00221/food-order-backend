package food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
