/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.stock.service;

import com.camrin.shopping.stock.form.StockForm;
import com.camrin.shopping.stock.view.StockView;

/**
 *
 * @author krishnakumar
 */
public interface StockService {
    
     public StockView addStock(StockForm form);
     public StockView getStock(String stockId);
     public StockView putStock(String stockId,StockForm form);
    public StockView delStock(String stockId);
    
}
