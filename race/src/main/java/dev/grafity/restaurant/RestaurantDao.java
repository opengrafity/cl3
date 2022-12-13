package dev.grafity.restaurant;

public class RestaurantDao {
	private Restaurant restaurant = new Restaurant();
	private Dish[] dishes = null;
	private Order[] orders = new Order[100];
	
	public RestaurantDao(){
		Dish dish1= new Dish("Roti",15,"Indian","Main");
		Dish dish2 = new Dish("Noodles",150,"Chainese","Main");
		Dish dish3 = new Dish("Palak Panneer",250,"Indian","Curry");
		Dish dish4 = new Dish("Chick Tikka Masala",280,"Indian","Curry");
		Dish dish5 = new Dish("Rice",180,"Indian","Main");
		dishes = new Dish[] {dish1,dish2, dish3, dish4, dish5};
	
		Branch branchOne = new Branch();
		branchOne.setBranchName("Naidupet");
		restaurant.addBranch(branchOne);
		Branch branchTwo = new Branch();
		branchTwo.setBranchName("Tirupathi");
		restaurant.addBranch(branchTwo);				
	}
	
	public Dish[] getAllDishes() {
		return this.dishes;
	}
	
	public Order[] getAllOrdersOfBranch(String branchName) {
		for(Branch branch : this.restaurant.getBranches()) {
			if(branchName.equals(branch.getBranchName())) {
				return branch.getOrders();
			}
		}
		return null;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}
	
	
}
