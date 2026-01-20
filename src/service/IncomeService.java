package service;

import model.Income;

import java.util.ArrayList;
import java.util.List;
//Income service
public class IncomeService {

    private List<Income> incomes = new ArrayList<>();

    public void addIncome(Income income) {
        incomes.add(income);
    }

    public List<Income> getAllIncomes() {
        return incomes;
    }
}
