import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    private TransactionType type;
    private TransactionStatus status;
    private double amount;
    private String description;
    private String timestamp;

    public Transaction(TransactionType type, TransactionStatus status, double amount, String description)  {
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.description = description;
        this.timestamp = LocalDateTime.now().format(formatter);
    }

    public TransactionStatus getStatus() {
        return this.status;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] "
                + status + " | "
                + type + " | "
                + amount + " | "
                + description;
    }
}
