package payment;

import java.util.Scanner;

public class CardAcceptor implements PaymentAcceptor {
    private int balance;

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер карты: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Введите одноразовый пароль: ");
        String otp = scanner.nextLine();
        // Для примера просто начислим условные деньги
        balance = 500;
        System.out.println("Карта " + cardNumber + " авторизована. Баланс: " + balance);
    }

    @Override
    public void withdraw(int amount) {
        if (balance < amount) {
            throw new IllegalStateException("Недостаточно средств на карте!");
        }
        balance -= amount;
    }

    @Override
    public void reset() {
        balance = 0;
    }
}