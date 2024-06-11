package SimpleBankingApplication;

public enum AccountType {
    
    CHECKING("Checking"),
    SAVING("Saving"),
    INVESTING("Inversting");

    private final String accType;

    AccountType(String accString){
        this.accType = accString;
    }

    @Override
    public String toString(){
        return this.accType;
    }
}
