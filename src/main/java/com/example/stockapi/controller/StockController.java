package com.example.stockapi.controller;

import com.example.stockapi.model.Stock;
import com.example.stockapi.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @GetMapping("/{name}")
    public Stock getStockByName(@PathVariable String name) {
        return stockService.getStockByName(name);
    }
}
