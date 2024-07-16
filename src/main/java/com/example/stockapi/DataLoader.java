package com.example.stockapi;

import com.example.stockapi.model.Stock;
import com.example.stockapi.model.Transaction;
import com.example.stockapi.repository.StockRepository;
import com.example.stockapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void run(String... args) throws Exception {
        loadStockData();
        loadTransactionData();
    }

    private void loadStockData() {
        if (stockRepository.count() == 0) {
            List<Stock> stocks = Arrays.asList(
                    new Stock("AAPL", 150.00, "VALID"),
                    new Stock("GOOGL", 2800.00, "VALID"),
                    new Stock("MSFT", 300.00, "VALID"),
                    new Stock("AMZN", 3400.00, "INVALID"),
                    new Stock("TSLA", 800.00, "VALID")
            );
            stockRepository.saveAll(stocks);
        }
    }

    private void loadTransactionData() {
        if (transactionRepository.count() == 0) {
            List<Transaction> transactions = Arrays.asList(
                    new Transaction("AAPL", 10, 150.00, new Date()),
                    new Transaction("GOOGL", 5, 2800.00, new Date()),
                    new Transaction("MSFT", 20, 300.00, new Date()),
                    new Transaction("AMZN", 1, 3400.00, new Date()),
                    new Transaction("TSLA", 15, 800.00, new Date())
            );
            transactionRepository.saveAll(transactions);
        }
    }
}
