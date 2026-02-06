package service;

import model.Expense;

import java.util.List;

// expenses service
public class ExpenseService {

    private static final String EXPENSE_FILE = "data/expenses.dat";

    private List<Expense> expenses;
    private int expenseIdCounter = 1;

    public ExpenseService() {
        expenses = FileService.loadFromFile(EXPENSE_FILE);

        if (!expenses.isEmpty()) {
            expenseIdCounter =
                    expenses.get(expenses.size() - 1).getId() + 1;
        }
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        FileService.saveToFile(expenses, EXPENSE_FILE);
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }

    public int generateExpenseId() {
        return expenseIdCounter++;
    }
}
