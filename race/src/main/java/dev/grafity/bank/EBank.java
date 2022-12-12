package dev.grafity.bank;

public class EBank implements BasicOnlineBank,AllMobileBanking{
	public void internetBanking() {
		System.out.println("Internet banking is being accessed");
	}
	
	public void mobileBanking() {
		System.out.println("Mobile banking is being accessed");
	}
	
	public void smsBanking() {
		System.out.println("SMS banking is being accessed");
	}
	
	public void kioskBanking() {
		System.out.println("KIOSK banking is being accessed");
	}		
}
