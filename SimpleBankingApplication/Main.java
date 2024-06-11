package SimpleBankingApplication;

public class Main {
    public static void main(String[] args) {
        Account firstAcc = new Account(AccountType.SAVING, Currency.DOLLAR, 50.1); // Will Pass
        Account secondAcc = new Account(AccountType.INVESTING, Currency.WON, 50.01);  // Will Pass
        Account thirdAcc = new Account(AccountType.CHECKING, Currency.ZLOTY, 50.001); // Will Fail
    }
}
