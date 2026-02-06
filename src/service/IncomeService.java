package service;

import model.Income;

import java.util.List;

// Income service class
public class IncomeService {

    private static final String INCOME_FILE = "data/income.dat";

    private List<Income> incomes;

    public IncomeService() {
        incomes = FileService.loadFromFile(INCOME_FILE);
    }

    public void addIncome(Income income) {
        incomes.add(income);
        FileService.saveToFile(incomes, INCOME_FILE);
    }

    public List<Income> getAllIncomes() {
        return incomes;
    }
}
