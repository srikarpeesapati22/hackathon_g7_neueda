package com.example.stockapi.service;

import com.example.stockapi.model.Stock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class StockService {

    private final List<Stock> stocks = List.of(
            new Stock("AAPL", new Random().nextDouble() * 1000),
            new Stock("GOOGL", new Random().nextDouble() * 1000),
            new Stock("AMZN", new Random().nextDouble() * 1000)
    );

    public List<Stock> getAllStocks() {
        return stocks;
    }

    public Stock getStockByName(String name) {
        return stocks.stream()
                .filter(stock -> stock.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
