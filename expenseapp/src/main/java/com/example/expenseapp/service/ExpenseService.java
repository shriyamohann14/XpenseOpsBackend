package com.example.expenseapp.service;

import com.example.expenseapp.model.Expense;
import com.example.expenseapp.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public Expense saveExpense(Expense expense) {
        return repository.save(expense);
    }
}