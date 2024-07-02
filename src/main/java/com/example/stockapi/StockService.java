package com.example.stockapi;

import com.example.stockapi.Stock;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class StockService {
    private final List<Stock> stocks = new ArrayList<>();

    public StockService() {
        generateDummyData();
    }

    private void generateDummyData() {
        String[] stockNames = {"AAPL", "GOOGL", "MSFT", "AMZN", "FB"};
        Random random = new Random();

        for (String name : stockNames) {
            double price = 100 + (1000 - 100) * random.nextDouble();
            stocks.add(new Stock(name, price));
        }
    }

    public List<Stock> getAllStocks() {
        return stocks;
    }

    public Stock getStockByName(String name) {
        return stocks.stream().filter(stock -> stock.getName().equals(name)).findFirst().orElse(null);
    }
}
