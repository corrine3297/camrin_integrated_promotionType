/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.stock.Controller;

import com.camrin.shopping.stock.form.StockForm;
import com.camrin.shopping.stock.service.StockService;
import com.camrin.shopping.stock.view.StockView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





/**
 *
 * @author geoge
 */
@RestController
@RequestMapping("/stock")
public class Stockcontroller {
    
    @Autowired
    StockService stockService;
    @PostMapping("")
    public StockView addStock(@RequestBody StockForm form) {
        return stockService.addStock(form);
    }
    
     @GetMapping("/{stockId}")
    public StockView getStockById(@PathVariable String stockId) {
        return stockService.getStock(stockId);
    }  
    @PutMapping("/update/{stockId}")
    public StockView putStockById(@PathVariable String stockId,@RequestBody StockForm form) {
        return stockService.putStock(stockId,form) ;
    } 
    @DeleteMapping("/delete/{stockId}")
    public StockView delStockById(@PathVariable String stockId){
        return stockService.delStock(stockId);
    }
    
}
