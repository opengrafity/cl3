package dev.grafity.cf;

public class NestedClassDemo {
	public static void main(String[] args) {
		Account account = new Account();
		account.setId(1);
		account.setName("Skillyheads Private Limited");
		
		Object obj = account.createAddressObject("1/21", "GNT Road", "Naidupet", "Tirupathi", "524126");
		
		account.setPerminantAddress(obj);
		
		//Account.Address add = account.new Address();
		
		//account.setPresentAddress(add);
		
		Account.Address add = new Account.Address();
	}
}
