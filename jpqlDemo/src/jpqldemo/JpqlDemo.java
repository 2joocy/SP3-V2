/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpqldemo;

import entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mapperHandler.studentMapper;

/**
 *
 * @author William Pfaffe
 */
public class JpqlDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        studentMapper st = new studentMapper();
        Student student = new Student();
        student.setFirstname("William");
        student.setLastname("Pfaffe");
        student.setId(100);
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pul");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        entitymanager.persist(student);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    
    }
    
}
