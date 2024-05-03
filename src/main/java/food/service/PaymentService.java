package food.service;

import com.stripe.exception.StripeException;
import food.model.Order;
import food.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
