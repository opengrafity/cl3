package dev.grafity;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {
    public static void main(String[] args) {
        List<SavingsAccount> accounts = new ArrayList<SavingsAccount>();
        accounts.add(new SavingsAccount(1,"Kumar",3500000.5,12));
        accounts.add(new SavingsAccount(2,"Janaki",2500000.5,12));
        accounts.add(new SavingsAccount(3,"Janani",1500000.5,7.8));
        List<Account> plainAccounts = new ArrayList<Account>();
        AccountsUtil.display(plainAccounts);
    }
}
