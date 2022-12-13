package dev.grafity.restaurant;

import java.util.Scanner;
import java.util.UUID;

public class AppScreen {
	public static void main(String[] args) {
		int choice = 0;
		int dishChoice = -1;
		RestaurantService service = new RestaurantService();
		Scanner sc = new Scanner(System.in);
		OUT:do {
			System.out.println("Enter your choice \n1)Create Order \n2)Find all orders of a branch \n9)Exit");
			choice = Integer.parseInt(sc.nextLine());
			dishChoice = -1;
			switch(choice){
			case 1:
				//Order creation logic;
				Order ord = new Order(UUID.randomUUID().toString(),"13-DEC-2022");
				while(dishChoice!=0){
					System.out.println("Enter a dish");
					Dish[]  dishes = service.getAllDishes();
					int i=1;
					for(Dish dish:dishes) {					
						System.out.println(i++ +")"+dish.getName() +" ----- "+dish.getPrice());					
					}
					System.out.println("0) Exit");
					dishChoice = Integer.parseInt(sc.nextLine());
					if(dishChoice!=0) {
						ord.addADish(dishes[dishChoice-1]); 
					}
				}
				System.out.println("Enter the branch");
				String branchName = sc.nextLine();
				service.takeOrder(ord, branchName);
				break;				
			case 2:
				System.out.println("Enter the branch");
				branchName = sc.nextLine();
				Order[] ords = service.getAllOrders(branchName);
				for(int i=0;i<ords.length;i++) {
					if(ords[i]!=null) {
						System.out.println(ords[i].getOrderNo() + "<--->");
						for(int j=0;j<ords[i].getDishes().length;j++) {
							if(ords[i].getDishes()[j]!=null) {
								System.out.println(ords[i].getDishes()[j].getName()+"<--->"+ords[i].getDishes()[j].getPrice());
							}
						}
					}
				}
				break;
			case 9:
				break OUT;
			}
		}while(choice != 9);
		
		
	}
}
