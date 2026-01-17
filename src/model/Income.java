package model;

import java.io.Serializable;
import java.time.LocalDate;

// The
//Serializable interface in Java is a marker interface that signals to the Java Virtual Machine (JVM)
// that objects of that class can be converted into a byte stream and back.
// This process, called serialization, is used to save an object's state so it can be stored or transferred
// and later reconstructed (deserialized).
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
