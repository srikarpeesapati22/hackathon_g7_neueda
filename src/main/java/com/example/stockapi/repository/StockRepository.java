package com.example.stockapi.repository;

import com.example.stockapi.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Long> {
    Stock findByName(String name);
    List<Stock> findByStatus(String status);
}
