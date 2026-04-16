public interface Payable {
    abstract double getFinaleValue();
    abstract void pay(double value);
    abstract boolean isPaid();
}
