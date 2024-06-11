package SimpleBankingApplication.Exceptions;

public class WrongMoneyFormat extends RuntimeException {
    public WrongMoneyFormat(Object money) {
        super("Following 'money' parameter is of wrong format: " + money);
    }
}
