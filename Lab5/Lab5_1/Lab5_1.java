import java.util.*;
public class Lab5_1 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);

        System.out.print("Choose withdraw(1) or deposit(2) : ");
        int choice = in.nextInt();
        if(choice == 1) {
            System.out.print("Enter amount : ");
            int amount = in.nextInt();
            account.withdraw(amount);
            System.out.println(account.toString());
        }
        else if(choice == 2) {
            System.out.print("Enter amount : ");
            int amount = in.nextInt();
            account.deposit(amount);
            System.out.println(account.toString());
        }
        else System.out.println("ERROR::Please select 1 or 2");
        in.close();
    }
}
