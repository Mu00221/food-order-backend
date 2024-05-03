package food.service;

import java.util.List;

import food.model.Notification;
import food.model.Order;
import food.model.Restaurant;
import food.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
