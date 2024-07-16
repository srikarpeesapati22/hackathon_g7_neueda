package com.example.stockapi.service;

import com.example.stockapi.model.Stock;
import com.example.stockapi.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Stock getStockByName(String name) {
        return stockRepository.findByName(name);
    }

    public Stock addStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock updateStock(String name, Stock stock) {
        Stock existingStock = stockRepository.findByName(name);
        existingStock.setPrice(stock.getPrice());
        existingStock.setStatus(stock.getStatus());
        return stockRepository.save(existingStock);
    }

    public List<Stock> searchStocks(String status) {
        return stockRepository.findByStatus(status);
    }
}
