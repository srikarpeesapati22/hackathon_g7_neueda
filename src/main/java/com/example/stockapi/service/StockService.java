package com.example.stockapi.service;

import com.example.stockapi.model.Stock;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class StockService {
    private final List<Stock> stocks = new ArrayList<>();

//    public StockService() {
//        generateDummyData();
//    }

    public List<Stock> getAllStocks() {
        return stocks;
    }

    public Stock getStockByName(String name) {
        return stocks.stream().filter(stock -> stock.getName().equals(name)).findFirst().orElse(null);
    }
}
