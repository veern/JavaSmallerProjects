package SimpleBankingApplication;

public class Main {
    public static void main(String[] args) {
        Account firstAcc = new Account(AccountType.CHECKING, Currency.ZLOTY, 50.0);
        System.out.println(firstAcc.getAccountType());
    }
}
