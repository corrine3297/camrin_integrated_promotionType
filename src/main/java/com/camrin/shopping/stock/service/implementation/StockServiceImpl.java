/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.stock.service.implementation;

import com.camrin.shopping.stock.entity.Stock;
import com.camrin.shopping.stock.form.StockForm;
import com.camrin.shopping.stock.repository.StocksRepository;
import com.camrin.shopping.stock.service.StockService;
import com.camrin.shopping.stock.view.StockView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author geoge
 */
@Service
public class StockServiceImpl implements StockService{
    @Autowired
    StocksRepository stockRepository;

    @Override
    public StockView addStock(StockForm form) {
         Stock stock = stockRepository.save(new Stock(form.getStockId(), form.getInventoryProductId(), form.getStockProductQuantity(), form.getStockTotalAmount()));
        return new StockView(stock.getStockId(), stock.getInventoryProductId(), stock.getStockProductQuantity(), stock.getStockTotalAmount()); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public StockView getStock(String stockId) {
        
        Stock stock = stockRepository.findById(stockId);
        return new StockView(stock.getStockId(), stock.getInventoryProductId(), stock.getStockProductQuantity(), stock.getStockTotalAmount());
    }
    
     @Override
    public StockView putStock(String stockId,StockForm form) {
        
        Stock stockfromdb = stockRepository.findById(stockId);
        stockfromdb.setStockId(form.getStockId());
        stockfromdb.setInventoryProductId(form.getInventoryProductId());
        stockfromdb.setStockProductQuantity(form.getStockProductQuantity());
        stockfromdb.setStockTotalAmount(form.getStockTotalAmount());
        
        Stock stock = stockRepository.save(stockfromdb);
        // = userRepository.findByUserId(userId);
        return new StockView(stock.getStockId(), stock.getInventoryProductId(), stock.getStockProductQuantity(), stock.getStockTotalAmount());
    }
    
    @Override
     public  StockView delStock(String stockId) {
        Stock stock=stockRepository.findById(stockId);
        stockRepository.delete(stock);
        return new StockView(stock.getStockId(), stock.getInventoryProductId(), stock.getStockProductQuantity(), stock.getStockTotalAmount());
     }
}
