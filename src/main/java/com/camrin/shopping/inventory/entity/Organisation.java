/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camrin.shopping.product.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author krishnakumar
 */
@Entity
public class Organisation implements Serializable {

    @Id
    private Long organisationId;

    private String name;

    public Long getOrganisationId() {
        return organisationId;
    }

    public String getName() {
        return name;
    }

}
