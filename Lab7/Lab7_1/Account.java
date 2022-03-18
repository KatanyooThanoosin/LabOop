import java.util.*;

public class Account {

    // Attributes
    private int id;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;

    // Constructor
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.dateCreated = new Date();
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    // Method
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 1200;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if(amount < 0 || this.balance - amount < 0){
            System.out.println("ERROR::CANNOT WITHDRAW WITH "+amount);
        }
        else this.balance -= amount;
    }

    public void deposit(double amount) {
        if(amount < 0){
            System.out.println("ERROR::CANNOT DEPOSIT WITH "+amount);
        }
        else this.balance += amount;
    }

    @Override
    public String toString(){
        return "Account{id="+this.id+
        ", balance="+this.balance+
        ", annualInterestRate="+this.annualInterestRate+
        ", dateCreated="+this.dateCreated+"}";
    }
}
