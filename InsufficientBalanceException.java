
package exceptionhandlingprograms;


// Custom exception class
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }

    boolean getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
