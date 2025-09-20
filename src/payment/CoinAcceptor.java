package payment;

import java.util.Scanner;

public class CoinAcceptor implements PaymentAcceptor {
    private int balance;

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму монет: ");
        int coins = scanner.nextInt();
        balance += coins;
        System.out.println("Зачислено " + coins + ". Текущий баланс: " + balance);
    }

    @Override
    public void withdraw(int amount) {
        if (balance < amount) {
            throw new IllegalStateException("Недостаточно средств. Нужно " + amount + ", доступно " + balance);
        }
        balance -= amount;
    }

    @Override
    public void reset() {
        balance = 0;
    }
}