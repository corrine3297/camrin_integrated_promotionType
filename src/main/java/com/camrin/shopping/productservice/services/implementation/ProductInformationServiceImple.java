/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.productservice.services.implementation;

import com.camrin.shopping.productservice.services.ProductInformationService;
import com.camrin.shopping.productservice.entity.ProductInformationTable;
import com.camrin.shopping.productservice.form.ProductInformationForm;
import com.camrin.shopping.productservice.view.ProductInformationView;
import com.camrin.shopping.productservice.repository.ProductInformationRepository;
import com.camrin.productservice.fileupload.FileUploadUtil;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ANISH
 */
@Service
public class ProductInformationServiceImple implements ProductInformationService {
    
    @Autowired
    ProductInformationRepository productInformationRepository;
    
    @Override
    public ProductInformationView addProductInformation(ProductInformationForm form,MultipartFile image1,
            MultipartFile image2, MultipartFile image3, MultipartFile image4) throws IOException{
        
        String productImage1 = StringUtils.cleanPath(image1.getOriginalFilename());
        String productImage2 = StringUtils.cleanPath(image2.getOriginalFilename());
        String productImage3 = StringUtils.cleanPath(image3.getOriginalFilename());
        String productImage4 = StringUtils.cleanPath(image4.getOriginalFilename());
        
        form.setProductInformationImage1(productImage1);
        form.setProductInformationImage2(productImage2);
        form.setProductInformationImage3(productImage3);
        form.setProductInformationImage4(productImage4);
        
        ProductInformationTable productInformation = productInformationRepository.save(new ProductInformationTable(
        form.getProductInformationId(),form.getInventoryProductId(),form.getProductInformationImage1(),
        form.getProductInformationImage2(),form.getProductInformationImage3(),form.getProductInformationImage4(),
        form.getProductSellerMrp(),form.getPromotionBrandId(),form.getKeywordTag()));
        
        String uploadDir = "/product_images" + productInformation.getProductInformationId();
        
        FileUploadUtil.saveFile(uploadDir,productImage1, image1);
        FileUploadUtil.saveFile(uploadDir,productImage2, image2);
        FileUploadUtil.saveFile(uploadDir,productImage3, image3);
        FileUploadUtil.saveFile(uploadDir,productImage4, image4);
        
        return new ProductInformationView(productInformation.getProductInformationId(),
        productInformation.getInventoryProductId(),productInformation.getProductInformationImage1(),
        productInformation.getProductInformationImage2(),productInformation.getProductInformationImage3(),
        productInformation.getProductInformationImage4(),productInformation.getProductSellerMrp(),
        productInformation.getPromotionBrandId(),productInformation.getKeywordTag());
    }
    
    @Override
    public ProductInformationView getProductInformation(String productInformationId) {
        ProductInformationTable productInformation = productInformationRepository.findById(productInformationId);
        
        return new ProductInformationView(productInformation.getProductInformationId(),
        productInformation.getInventoryProductId(),productInformation.getProductInformationImage1(),
        productInformation.getProductInformationImage2(),productInformation.getProductInformationImage3(),
        productInformation.getProductInformationImage4(),productInformation.getProductSellerMrp(),
        productInformation.getPromotionBrandId(),productInformation.getKeywordTag());
    }

    @Override
    public ProductInformationView putProductInformation(ProductInformationForm form, String productInformationId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductInformationView deleteProductInformation(ProductInformationForm form, String productInformationId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
