/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

/**
 *
 * @author William Pfaffe
 */
@Entity
@DiscriminatorColumn(name = "DISCOUNT_TYPE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table
public class DiscountType extends Customer{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiscount;
    private double pricePerItem;
    private int quantity;
    
    public int getIdDiscount() {
        return idDiscount;
    }

    public void setIdDiscount(int idDiscount) {
        this.idDiscount = idDiscount;
    }

    public double calcDiscount(double pricePerItem, int quantity){
        return pricePerItem * quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    @Override
    public String toString() {
        return "entity.DiscountType[ id=" + idDiscount + " pricePerItem=" + pricePerItem + " quantity= " + quantity + "]";
    }
    
}
