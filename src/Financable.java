public interface Financable {
    abstract double checkBalance();
    abstract boolean hasEnoughMoney(double value);
    abstract String getFinanceStatus();
}
