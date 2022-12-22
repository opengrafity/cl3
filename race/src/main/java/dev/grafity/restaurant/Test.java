package dev.grafity.restaurant;

import dev.grafity.restaurant.model.Branch;
import dev.grafity.restaurant.model.Dish;
import dev.grafity.restaurant.model.Order;
import dev.grafity.restaurant.model.Restaurant;

public class Test {
	public static void main(String[] args) {
		Dish dish1= new Dish("Roti",15,"Indian","Main");
		Dish dish2 = new Dish("Noodles",150,"Chainese","Main");
		Dish dish3 = new Dish("Palak Panneer",250,"Indian","Curry");
		Dish dish4 = new Dish("Chick Tikka Masala",280,"Indian","Curry");
		Dish dish5 = new Dish("Rice",180,"Indian","Main");
		
		Order or1 = new Order("ORD0001","10-DEC-2022");		
		or1.addADish(dish1);
		or1.addADish(dish2);
		or1.addADish(dish3);
		
		Order or2 = new Order("ORD0002","10-DEC-2022");
		or2.addADish(dish1);
		or2.addADish(dish3);
				
		Order or3 = new Order("ORD0003","11-DEC-2022");
		or3.addADish(dish5);
		
		Order or4 = new Order("ORD0004","11-DEC-2022");
		or4.addADish(dish5);
		
		Branch branchOne = new Branch();
		branchOne.setBranchName("Naidupet");
		
		branchOne.addOrder(or1);
		branchOne.addOrder(or3);
		
		

		Branch branchTwo = new Branch();
		branchTwo.setBranchName("Tirupathi");
		branchTwo.addOrder(or2);
		branchTwo.addOrder(or4);
		
		
		Restaurant rest = new Restaurant();
		rest.addBranch(branchOne);
		rest.addBranch(branchTwo);		
		
		for(Branch branch:rest.getBranches()) {
			if(branch==null) {
				continue;
			}
			if("Tirupathi".equals(branch.getBranchName())) {				
				for(Order ord:branch.getOrders()) {
					double orderValue = 0;
					if(ord!=null) {
						for(Dish dish: ord.getDishes()) {
							if(dish != null) {
								orderValue += dish.getPrice();
							}
						}
						System.out.println(ord.getOrderNo() + "<--->" + orderValue);
					}
					
				}
			}
		}
		
	}
}
