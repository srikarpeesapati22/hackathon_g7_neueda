package com.example.stockapi.controller;

import com.example.stockapi.model.Stock;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    private final List<Stock> stocks = List.of(
            new Stock("AAPL", new Random().nextDouble() * 1000),
            new Stock("GOOGL", new Random().nextDouble() * 1000),
            new Stock("AMZN", new Random().nextDouble() * 1000)
    );

    @GetMapping
    public List<Stock> getAllStocks() {
        return stocks;
    }

    @GetMapping("/{name}")
    public Stock getStockByName(@PathVariable String name) {
        return stocks.stream()
                .filter(stock -> stock.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
