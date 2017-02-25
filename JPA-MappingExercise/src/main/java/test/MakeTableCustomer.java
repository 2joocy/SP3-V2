/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Customer;
import enums.CustomerType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author William Pfaffe
 */
public class MakeTableCustomer {

    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        Customer customeer = new Customer();
        customeer.setcName("Swenno Menno");
        customeer.setType(CustomerType.GOLD);
        customeer.setId(10);
        entitymanager.persist(customeer);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();

    }
}
