package food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import food.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
