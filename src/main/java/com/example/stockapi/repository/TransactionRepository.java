package com.example.stockapi.repository;

import com.example.stockapi.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByStockName(String stockName);
}
