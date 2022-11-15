class AccountImplementation implements Account {
    int mBalance = 0;

    private void addToBalance(int amount) {
        mBalance += amount;
    }

    // synchronized
    public void deposit(int amount) {
        if (amount > 0) {
            addToBalance(amount);
        }
    }

    public int withdraw(int amount) {
        if (amount >= 0 && mBalance - amount >= 0) {
            addToBalance(-amount);
            return mBalance;
        } else {
            return 0;
        }
    }
}