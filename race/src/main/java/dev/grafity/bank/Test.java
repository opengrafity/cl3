package dev.grafity.bank;

public class Test {
	public static void main(String[] args) {
		Customer custOne = new Customer();
		custOne.setId(1);
		custOne.setName("Murali");
		custOne.setPanNo("TBA102542");
		custOne.setAadharNo("996587599875");
		custOne.setAddress("Kalahasthi");
		
		
		Account acc= new Account();
		acc.setId(1);
		acc.setAccountNo("125412541263");
		acc.setAccountName("Infosec");
		acc.setOpeningDate("10-DEC-2022");
		acc.setBalance(10000000);
		
		custOne.setAccount(acc);
		
		System.out.println(custOne.getAccount().getBalance());
		
		System.out.println(custOne.toString());
		
	}
}
