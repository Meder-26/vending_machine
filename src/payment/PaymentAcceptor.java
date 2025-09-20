package payment;

public interface PaymentAcceptor {

    int getBalance();
    void deposit();
    void withdraw(int amount) throws IllegalStateException;
    void reset();

    }