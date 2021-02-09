package com.camrin.shopping.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"hello","com.camrin.shopping.promotionbrand.controller","com.camrin.shopping.promotionbrand.service","com.camrin.shopping.user.controller","com.camrin.shopping.user.service","com.camrin.shopping.userbehavior.controller","com.camrin.shopping.userbehavior.service","com.camrin.shopping.stock.Controller","com.camrin.shopping.stock.service","com.camrin.shopping.inventory.controller", "com.camrin.shopping.inventory.service","com.camrin.shopping.holiday.controller", "com.camrin.shopping.holiday.service","com.camrin.shopping.inventoryproductcategory.controller","com.camrin.shopping.inventoryproductcategory.service","com.camrin.shopping.productservice.controller","com.camrin.shopping.productservice.services","com.camrin.shopping.promotionuser.controller","com.camrin.shopping.promotionuser.service","com.camrin.shopping.brandcategory.controller", "com.camrin.shopping.brandcategory.service","com.camrin.shopping.brand.controller","com.camrin.shopping.brand.service"})
@EntityScan(basePackages={"com.camrin.shopping.stock.entity","com.camrin.shopping.promotionbrand.entity","com.camrin.shopping.userbehavior.entity","com.camrin.shopping.user.entity","com.camrin.shopping.promotionuser.entity","com.camrin.shopping.inventory.entity","com.camrin.shopping.holiday.entity","com.camrin.shopping.inventoryproductcategory.entity","com.camrin.shopping.productservice.entity","com.camrin.shopping.brandcategory.entity","com.camrin.shopping.brand.entity"})
@EnableJpaRepositories(basePackages={"com.camrin.shopping.stock.repository","com.camrin.shopping.promotionbrand.repository","com.camrin.shopping.userbehavior.repository","com.camrin.shopping.user.repository","com.camrin.shopping.promotionuser.repository","com.camrin.shopping.inventory.repository","com.camrin.shopping.holiday.repository","com.camrin.shopping.inventoryproductcategory.repository","com.camrin.shopping.productservice.repository","com.camrin.shopping.brandcategory.repository","com.camrin.shopping.brand.repository"})

public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
