package dev.grafity.bank;

public class interfaceTest {
	public static void main(String[] args) {
		BasicOnlineBank ref = new EBank();
		ref.internetBanking();
		
		AllMobileBanking ref2 = new EBank();
		ref2.mobileBanking();
		ref2.smsBanking();
	}
}
