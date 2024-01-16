import java.util.Scanner;

class ATMachine
{
    protected bankAccount account;
    ATMachine (bankAccount usersAcc)
    {
        this.account=usersAcc;
    }
    void TransactionMenu(Scanner scan)
    {
        System.out.println("Menu:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
        switch(scan.nextInt()){
            case 1:
            account.checkBalance();
            break;
            case 2:
            System.out.print("Enter the amount to be deposited: ");
            account.deposit(scan.nextDouble());
            break;
            case 3:
            System.out.print("Enter the amount to be withdrawn: ");
            account.withdraw(scan.nextDouble());
            break;
            case 4:
            System.out.println("Exiting. Thank you!");
            System.exit(0);
        }
    }
}
class bankAccount
{
    protected double balance;
    bankAccount (double initialBalance)
    {
        this.balance=initialBalance;
    }
    void withdraw (double amount)
    {
        if(amount<=balance && amount>0)
        {
            balance-=amount;
            System.out.println("SUCCESSFUL WITHDRAWAL.\nCURRENT BALANCE: "+balance);
        }
        else{
            System.out.println("Insufficient balance or Invalid withdrawal amount.");
        }
    }
    void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("SUCCESSFUL DEPOSIT.\nCURRENT BALANCE: "+balance);
        }
        else
        {
            System.out.println("Invalid deposit amount. Please enter only positive amount");
        }

    }
    void checkBalance()
    {
        System.out.println("Your account balance is "+balance);
    }
}
public class ATM
{
    public static void main(String[] args) {
        System.out.println(" ----- ATM ----- ");
        Scanner scanner = new Scanner(System.in);
        bankAccount userAccount = new bankAccount(1000.0);
        ATMachine atm = new ATMachine (userAccount);

        while (true) {
            atm.TransactionMenu(scanner);
    }
}
}