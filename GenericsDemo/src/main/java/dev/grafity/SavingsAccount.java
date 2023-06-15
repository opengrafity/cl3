package dev.grafity;

public class SavingsAccount extends Account{
    private double interest;

    public SavingsAccount() {
    }

    public SavingsAccount(int id, String name, double balance, double interest) {
        super(id, name, balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
