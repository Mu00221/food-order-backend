package food.service;

import java.util.List;

import food.Exception.FoodException;
import food.Exception.RestaurantException;
import food.model.IngredientCategory;
import food.model.IngredientsItem;
import food.model.Food;
import food.repository.IngredientsCategoryRepository;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
