package dev.grafity.restaurant.service;

import dev.grafity.restaurant.dao.RestaurantFileDao;
import dev.grafity.restaurant.dao.RestuarantDaoInf;
import dev.grafity.restaurant.model.Branch;
import dev.grafity.restaurant.model.Dish;
import dev.grafity.restaurant.model.Order;

public class RestaurantService {
	private RestuarantDaoInf dao = new RestaurantFileDao();
	
	public boolean takeOrder(Order ord, String branchName) {
		for(Branch branch : this.dao.getRestaurant().getBranches()) {
			if(branchName.equals(branch.getBranchName())) {
				branch.addOrder(ord);
				return true;
			}
		}
		return false;
	}
	
	public Dish[] getAllDishes() {
		return dao.getAllDishes();
	}
	
	public Order[] getAllOrdersOfBranch(String branchName) {
		return dao.getAllOrdersOfBranch(branchName);
	}
}
