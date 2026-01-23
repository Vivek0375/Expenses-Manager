package exception;

public class BudgetExceededException extends RuntimeException {
// budget class
    public BudgetExceededException(String message) {
        super(message);
    }
}
