package com.example.microstinkoff.controller;

import com.example.microstinkoff.model.Stock;
import com.example.microstinkoff.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StockController {
    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(String ticker){
        return stockService.getStockbyTicker(ticker);
    }
}
