package com.example.expenseapp.controller;

import com.example.expenseapp.model.Expense;
import com.example.expenseapp.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return service.saveExpense(expense);
    }
}
