/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.repository;

import com.camrin.shopping.productservice.entity.ProductInformationTable;
import org.springframework.data.repository.Repository;
/**
 *
 * @author ANISH
 */
public interface ProductInformationRepository extends Repository<ProductInformationTable, String> {
    
    public ProductInformationTable save(ProductInformationTable productInformation);
    
    public ProductInformationTable findById(String productInformationId);
    
    public ProductInformationRepository delete(ProductInformationTable productInformation);
    
}
