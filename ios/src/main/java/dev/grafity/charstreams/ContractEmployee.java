package dev.grafity.charstreams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
import java.util.Date;

public class ContractEmployee extends Employee implements Serializable {
    private Date contractEndDate;
    transient private String contractor;

    public ContractEmployee(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public ContractEmployee(int empNo, String empName, Double empSalary, Date contractEndDate) {
        super(empNo, empName, empSalary);
        this.contractEndDate = contractEndDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public ContractEmployee(int empNo, String empName, Double empSalary, Date contractEndDate, String contractor) {
        super(empNo, empName, empSalary);
        this.contractEndDate = contractEndDate;
        this.contractor = contractor;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(this.getEmpNo());
        oos.writeUTF(this.getEmpName());
        oos.writeDouble(this.getEmpSalary());
        Base64.Encoder encoder =  Base64.getEncoder();
        String encodedContractor = new String(encoder.encode(this.contractor.getBytes()));
        System.out.println(encodedContractor);
        oos.writeUTF(encodedContractor);
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.setEmpNo(ois.readInt());
        this.setEmpName(ois.readUTF());
        this.setEmpSalary(ois.readDouble());
        Base64.Decoder decoder =  Base64.getDecoder();
        String decodedContractor = ois.readUTF();
        this.contractor = new String(decoder.decode(decodedContractor.getBytes()));
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "contractEndDate=" + contractEndDate +
                ", contractor='" + contractor + '\'' +
                "} " + super.toString();
    }
}
