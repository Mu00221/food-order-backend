package food.service;

import java.util.List;

import com.stripe.exception.StripeException;
import food.Exception.CartException;
import food.Exception.OrderException;
import food.Exception.RestaurantException;
import food.Exception.UserException;
import food.model.Order;
import food.model.PaymentResponse;
import food.model.User;
import food.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
