/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapperHandler;

import entity.Student;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author William Pfaffe
 */
public class studentMapper {

    public void getAllStudents() {
        int counter = 0;
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pul");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createNamedQuery("Student.findAll");

        ArrayList<Student> list = (ArrayList<Student>) query.getResultList();

        for (Student s : list) {
            counter++;
            System.out.print("Student ID :" + s.getId());
            System.out.println("\t Student Name :" + s.getFirstname() + " " + s.getLastname());
        }

        System.out.println("Total amount of Students: " + counter);
    }

    public void findAllStudentsGivenFirstName(String firstName) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pul");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createNamedQuery("Student.findByFirstname");

        query.setParameter("firstname", firstName);
        ArrayList<Student> list = (ArrayList<Student>) query.getResultList();

        System.out.println("Current Students with " + firstName + " in their names were: ");
        for (Student s : list) {
            System.out.println(s.getFirstname() + " " + s.getLastname());
        }
    }

    public void findAllStudentsGivenLastName(String lastName) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pul");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createNamedQuery("Student.findByLastname");

        query.setParameter("lastname", lastName);
        ArrayList<Student> list = (ArrayList<Student>) query.getResultList();

        System.out.println("Current Students with " + lastName + " in their names were: ");
        for (Student s : list) {
            System.out.println(s.getFirstname() + " " + s.getLastname());
        }
    }

    public Student returnStudent(int id) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pul");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createNamedQuery("Student.findById");

        query.setParameter("id", id);

        Student student = (Student) query.getSingleResult();

        return student;
    }

    public void findStudyPointsGivenID(int id) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pul");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createNamedQuery("Studypoint.findById");

        query.setParameter("id", id);

        int points = query.getFirstResult();
        
        Student stu = returnStudent(id);
        
        System.out.println(stu.getFirstname() + " " + stu.getLastname() + " has " + points + " studypoints!");

    }
    
    /*
    DOES NOT WORK! MY BAD!
    */
    
//    public void getTotalScore(){
//        int totalPoints = 0;
//        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pul");
//        EntityManager entitymanager = emfactory.createEntityManager();
//        Query query = entitymanager.createNamedQuery("Studypoint.findAll");
//
//        ArrayList<Student> list = (ArrayList<Student>) query.getResultList();
//
//        for (Student s : list) {
//            totalPoints += s.getStudypointCollection();
//        }
//        
//        System.out.println("Total accumilated points are: " + totalPoints);
//    }
    
    public void getHighestStudyPoint(){
         EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pul");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createNamedQuery("SELECT MAX(SCORE) FROM studypoint");

        int studyP = query.getFirstResult();
                
        System.out.println("Highest studypoint given is: " + studyP);
    }
    
    
}
