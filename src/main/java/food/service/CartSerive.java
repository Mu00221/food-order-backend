package food.service;

import food.Exception.CartException;
import food.Exception.CartItemException;
import food.Exception.FoodException;
import food.Exception.UserException;
import food.model.Cart;
import food.model.CartItem;
import food.model.Food;
import food.model.User;
import food.request.AddCartItemRequest;
import food.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
