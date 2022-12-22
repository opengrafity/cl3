package dev.grafity.restaurant.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import dev.grafity.restaurant.model.Branch;
import dev.grafity.restaurant.model.Dish;
import dev.grafity.restaurant.model.Order;
import dev.grafity.restaurant.model.Restaurant;

public class RestaurantFileDao implements RestuarantDaoInf{
	private Restaurant restaurant = new Restaurant();
	private Dish[] dishes = null;
	
	public RestaurantFileDao(){
		BufferedReader fileReader = null;
		
		try{
			String line = null;
			fileReader = new BufferedReader(new FileReader(new File("C:/Vamsi/temp/dishes.txt")));
			List<Dish> dishes = new ArrayList<>();
			while((line=fileReader.readLine())!=null) {
				String[] dishProps = line.split(","); 
				dishes.add(new Dish(dishProps[0],Double.parseDouble(dishProps[1]),dishProps[2],dishProps[3]));
			}
			this.dishes = dishes.toArray(new Dish[0]);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	
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

	public Order[] getAllOrdersOfDish(String dishName) {
		Order[] orders = new Order[100];
		int i=0;
		boolean flag = false;
		for(Branch branch : this.restaurant.getBranches()) {
			for(Order order:branch.getOrders()) {
				for(Dish dish:order.getDishes()) {
					if(dish.getName().equalsIgnoreCase(dishName)) {
						flag = true;
					}
				}				
				if(flag) {
					orders[i++] = order;
					flag = false;
				}
			}			
		}
		return orders;
	}
	
	public Restaurant getRestaurant() {
		return restaurant;
	}
	
	
}
