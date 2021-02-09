/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.promotionbrand.controller;


import com.camrin.shopping.promotionbrand.view.PromotionBrandView;
import com.camrin.shopping.promotionbrand.form.PromotionBrandForm;
import com.camrin.shopping.promotionbrand.service.PromotionBrandService;

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
 * @author HP
 */

@RestController
@RequestMapping("/promotionbrand")
public class PromotionBrandController {
@Autowired
PromotionBrandService promotionBrandService;
@PostMapping("")
public PromotionBrandView addPromoBrand(@RequestBody PromotionBrandForm form)
{
     return promotionBrandService.addPromtionBrand(form);

}
@GetMapping("/{promotionBasedonBrandId}")
public PromotionBrandView getPromoBrand(@PathVariable String promotionBasedonBrandId)
{
      return promotionBrandService.getPromtionBrand(promotionBasedonBrandId);
     
}
    
@PutMapping("/update/{promotionBasedonBrandId}")
public PromotionBrandView putPromoBrand(@PathVariable String promotionBasedonBrandId,@RequestBody PromotionBrandForm form)
{
    return promotionBrandService.putPromtionBrand(promotionBasedonBrandId, form);
}



@DeleteMapping("/delete/{promotionBasedonBrandId}")
public PromotionBrandView deletePromoBrand(@PathVariable String promotionBasedonBrandId)
{
    return promotionBrandService.deletePromtionBrand(promotionBasedonBrandId);

}
    
}
