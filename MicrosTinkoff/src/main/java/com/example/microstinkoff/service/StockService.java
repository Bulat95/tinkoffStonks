package com.example.microstinkoff.service;

import com.example.microstinkoff.model.Stock;
import org.springframework.stereotype.Service;

@Service
public interface StockService {
    Stock getStockbyTicker(String ticker);
}
