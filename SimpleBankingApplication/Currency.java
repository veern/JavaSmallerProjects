package SimpleBankingApplication;

public enum Currency {
    
    ZLOTY("Polish Zloty"),
    DOLLAR("American Dollar"),
    EURO("Euro"),
    YEN("Japanese Yen"),
    PESO("Mexican Peso"),
    WON("South Korean Won");
    
    private final String friendlyCurrency;

    Currency(String currency) {
        this.friendlyCurrency = currency;
    }

    @Override
    public String toString() {
        return this.friendlyCurrency;
    }
    
}
