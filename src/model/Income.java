package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Income implements Serializable {

    private static final long serialVersionUID = 1L;

    private double amount;
    private String source;
    private LocalDate date;

    public Income(double amount, String source, LocalDate date) {
        this.amount = amount;
        this.source = source;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getSource() {
        return source;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Income{" +
                "amount=" + amount +
                ", source='" + source + '\'' +
                ", date=" + date +
                '}';
    }
}
