/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.services;

import com.camrin.shopping.productservice.form.ProductInformationForm;
import com.camrin.shopping.productservice.view.ProductInformationView;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;
/**
 *
 * @author ANISH
 */
public interface ProductInformationService {
    
    public ProductInformationView addProductInformation(ProductInformationForm form, MultipartFile image1, MultipartFile image2, MultipartFile image3, MultipartFile image4) throws IOException;
    
    public ProductInformationView getProductInformation(String productInformationId);
    
    public ProductInformationView putProductInformation(ProductInformationForm form, String productInformationId);
    
    public ProductInformationView deleteProductInformation(ProductInformationForm form, String productInformationId);
}
