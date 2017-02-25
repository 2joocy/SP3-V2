/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;

/**
 *
 * @author William Pfaffe
 */
@Entity
public class DiscountFixed extends DiscountType{
    double discount = 0.1;
    
    @Override
    public double calcDiscount(double priceItem, int quantity){
        return priceItem * discount * quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
}
