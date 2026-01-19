package service;

import model.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseService {

    private List<Expense> expenses = new ArrayList<>();
    private int expenseIdCounter = 1;

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public int generateExpenseId() {
        return expenseIdCounter++;
    }
}
