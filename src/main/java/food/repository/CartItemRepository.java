package food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
