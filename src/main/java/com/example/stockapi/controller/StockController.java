package com.example.stockapi.controller;

import com.example.stockapi.model.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class StockController {
    private List<Stock> stocks = new ArrayList<>();

    public StockController() {
        // Generate some dummy data
        Random random = new Random();
        stocks.add(new Stock("Apple", random.nextDouble() * 1000));
        stocks.add(new Stock("Google", random.nextDouble() * 1000));
        stocks.add(new Stock("Amazon", random.nextDouble() * 1000));
        stocks.add(new Stock("Microsoft", random.nextDouble() * 1000));
    }

    @GetMapping("/stocks")
    public List<Stock> getStocks() {
        return stocks;
    }

    @GetMapping("/stocks/{name}")
    public Stock getStock(@PathVariable String name) {
        return stocks.stream()
                .filter(stock -> stock.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
