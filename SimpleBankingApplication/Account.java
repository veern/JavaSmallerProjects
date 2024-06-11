package SimpleBankingApplication;

public class Account {
    
    private Currency currency;
    private AccountType accountType;
    private double amtOfMoney;

    public Account(AccountType accType, Currency currency, double money) {
        this.accountType = accType;
        this.currency = currency;
        this.amtOfMoney = money;
    }

    public Account(AccountType accType) {
        this.accountType = accType;
        this.currency = null;
        this.amtOfMoney = 0.0f;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public double getAmountOfMoney() {
        return this.amtOfMoney;
    }
}
