package dev.grafity.restaurant;

public class RestaurantService {
	private RestaurantDao dao = new RestaurantDao();
	
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
