
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account mattAcc = new Account("Matthews account", 1000.00);
        Account myAcc = new Account("My account", 0.0);
        mattAcc.withdrawal(100.0);
        myAcc.deposit(100.0);
        System.out.println(mattAcc + "\n" + myAcc);
    }
}
