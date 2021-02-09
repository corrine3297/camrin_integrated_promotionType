/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.inventoryproductcategory.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author jndjk
 */
@Entity
@Table(name = "inventory_product_category_table")
public class InventoryProductCategory implements Serializable {
    @Id
    private String inventory_product_category_id;
    private String inventory_product_category_name ;
    private String inventory_product_category_description;
    private String inventory_product_category_deleted ;
    private String inventory_product_category_updated;

    public InventoryProductCategory(String inventory_product_category_id, String inventory_product_category_name, String inventory_product_category_description, String inventory_product_category_deleted, String inventory_product_category_updated) {
        this.inventory_product_category_id = inventory_product_category_id;
        this.inventory_product_category_name = inventory_product_category_name;
        this.inventory_product_category_description = inventory_product_category_description;
        this.inventory_product_category_deleted = inventory_product_category_deleted;
        this.inventory_product_category_updated = inventory_product_category_updated;
    }

    public InventoryProductCategory() {
    }

    public String getInventory_product_category_id() {
        return inventory_product_category_id;
    }

    public String getInventory_product_category_name() {
        return inventory_product_category_name;
    }

    public String getInventory_product_category_description() {
        return inventory_product_category_description;
    }

    public String getInventory_product_category_deleted() {
        return inventory_product_category_deleted;
    }

    public String getInventory_product_category_updated() {
        return inventory_product_category_updated;
    }

    public void setInventory_product_category_id(String inventory_product_category_id) {
        this.inventory_product_category_id = inventory_product_category_id;
    }

    public void setInventory_product_category_name(String inventory_product_category_name) {
        this.inventory_product_category_name = inventory_product_category_name;
    }

    public void setInventory_product_category_description(String inventory_product_category_description) {
        this.inventory_product_category_description = inventory_product_category_description;
    }

    public void setInventory_product_category_deleted(String inventory_product_category_deleted) {
        this.inventory_product_category_deleted = inventory_product_category_deleted;
    }

    public void setInventory_product_category_updated(String inventory_product_category_updated) {
        this.inventory_product_category_updated = inventory_product_category_updated;
    }
    
    
}
