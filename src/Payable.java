public interface Payable {
    abstract double getFinalePrice();
    abstract void pay(double value);
    abstract boolean isPaid();
}
