package SimpleBankingApplication;

import SimpleBankingApplication.Exceptions.WrongMoneyFormat;

public class Account {
    
    private Currency currency;
    private AccountType accountType;
    private double amtOfMoney;

    public Account(AccountType accType, Currency currency, double money) {
        this.accountType = accType;
        this.currency = currency;
        if (checkIfMoneyHasMaximumTwoDecimals(money)) {
            this.amtOfMoney = money;
        }
        else {
            throw new WrongMoneyFormat(money);
        }
    }

    public Account(AccountType accType) {
        this.accountType = accType;
        this.currency = null;
        this.amtOfMoney = 0.0f;
    }

    public boolean checkIfMoneyHasMaximumTwoDecimals(double number) {
        double multipliedNumber = number * 100.0;
        return (multipliedNumber - (int) multipliedNumber) == 0;
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
