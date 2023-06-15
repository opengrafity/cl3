package dev.grafity;

public class ContractEmployee extends Employee{
    private String contractStartDate;
    private String contractEndDate;

    public ContractEmployee(int id, String name, String contractStartDate) {
        super(id,name);
        this.contractStartDate = contractStartDate;
    }
    public ContractEmployee(int id, String name, String contractStartDate, String contractEndDate) {
        this(id,name,contractStartDate);
        this.contractEndDate = contractEndDate;
    }

}
