/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.stock.repository;
import org.springframework.data.repository.Repository;
import com.camrin.shopping.stock.entity.Stock;


/**
 *
 * @author geoge
 */
public interface StocksRepository extends Repository<Stock, String> {
     public Stock save(Stock stock);
  
    public Stock findById(String stockId);
    
    public Stock delete(Stock stock);
}
