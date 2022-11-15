@ThreadSafe
public class Client {
    Account account;
    
    void getPaid(int amount) {
        account.deposit(amount);
    }

    int buyCoffe() {
        return account.withdraw(5);
    }
}