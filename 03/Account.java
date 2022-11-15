@ThreadSafe
public interface Account {
    void deposit(int amount);
    int withdraw(int amount); 
}