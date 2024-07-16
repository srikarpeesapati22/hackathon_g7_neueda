package com.example.stockapi.controller;

import com.example.stockapi.model.Stock;
import com.example.stockapi.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
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

    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stockService.addStock(stock);
    }

    @PutMapping("/{name}")
    public Stock updateStock(@PathVariable String name, @RequestBody Stock stock) {
        return stockService.updateStock(name, stock);
    }

    @GetMapping("/search")
    public List<Stock> searchStocks(@RequestParam String status) {
        return stockService.searchStocks(status);
    }
}
