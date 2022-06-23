package ua.com.javacertificateoracle.lesson4;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount BankAccountHerold = new BankAccount(
                1,
                "Herold",
                "FromRivia",
                1450);
        BankAccount BankAccountJohan = new BankAccount(
                2,
                "Johan",
                "Mc'Klayn",
                2850);
        BankAccountHerold.info();
        BankAccountJohan.info();
        BankAccountHerold.balanceFunding(1000);
        BankAccountJohan.balanceFunding(1000);
        BankAccountHerold.info();
        BankAccountJohan.info();
        BankAccountHerold.withdrawal(800);
        BankAccountJohan.withdrawal(900);
        BankAccountHerold.info();
        BankAccountJohan.info();
    }
}
