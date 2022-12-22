package dev.grafity.restaurant.dao;

import dev.grafity.restaurant.model.Dish;
import dev.grafity.restaurant.model.Order;
import dev.grafity.restaurant.model.Restaurant;


public interface RestuarantDaoInf {
	Order[] getAllOrdersOfDish(String dishName);
	Order[] getAllOrdersOfBranch(String dishName);
	public Restaurant getRestaurant();
	public Dish[] getAllDishes();
}
