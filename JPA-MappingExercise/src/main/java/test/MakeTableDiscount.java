/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.DiscountType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author William Pfaffe
 */
public class MakeTableDiscount {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        DiscountType discount = new DiscountType();
        discount.setPricePerItem(10.1);
        discount.setQuantity(100);
        entitymanager.persist(discount);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();

    }
}
