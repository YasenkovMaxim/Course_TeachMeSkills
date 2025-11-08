package FinalProjectJavaCore.ClassesForWork;

public class Transfer {
    private String accountFrom;
    private String accountTo;
    private int amount;

    @Override
    public String toString() {
        return "Transfer{" +
                "accountFrom='" + accountFrom + '\'' +
                ", accountTo='" + accountTo + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Transfer(String accountFrom, String accountTo, int amount) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
