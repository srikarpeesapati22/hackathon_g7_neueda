package com.example.stockapi.controller;

import com.example.stockapi.model.Transaction;
import com.example.stockapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/stock/{stockName}")
    public List<Transaction> getTransactionsByStockName(@PathVariable String stockName) {
        return transactionService.getTransactionsByStockName(stockName);
    }

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.addTransaction(transaction);
    }
}
