/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Project;
import entity.ProjectUser;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author William Pfaffe
 */
public class MakeTableProject {
    public static void main(String[] args) {
       EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "pu" );
   EntityManager entitymanager = emfactory.createEntityManager( );
   entitymanager.getTransaction( ).begin( );
   Date dateCreated = new Date();
   Date dateEdited = new Date();

   Project pro1 = new Project(1, "Bingodrengene", "Her spiller vi bingo", dateCreated, dateEdited, null);
   Project pro2 = new Project(1, "Dansk Time", "Her lærer vi dansk", dateCreated, dateEdited, null);
   Project pro3 = new Project(1, "Matematik", "Her lærer vi matematik", dateCreated, dateEdited, null);

   entitymanager.persist(pro1);
   entitymanager.persist(pro2);
   entitymanager.persist(pro3);

   ArrayList<Project> projectSet1 = new ArrayList();
   projectSet1.add(pro1);
   projectSet1.add(pro2);
   projectSet1.add(pro3);
   
   ArrayList<Project> projectSet2 = new ArrayList();
   projectSet1.add(pro2);
   projectSet1.add(pro3);
   projectSet1.add(pro1);

   ArrayList<Project> projectSet3 = new ArrayList();
   projectSet1.add(pro3);
   projectSet1.add(pro1);
   projectSet1.add(pro2);

   
   ProjectUser user1 = new ProjectUser(1, "William", "william.pfaffe@gmail.com", projectSet1);
   ProjectUser user2 = new ProjectUser(2, "Chris", "chris@gmail.com", projectSet2);
   ProjectUser user3 = new ProjectUser(3, "Viktor", "viktor.pfaffe@gmail.com", projectSet3);

   entitymanager.persist(user1);
   entitymanager.persist(user2);
   entitymanager.persist(user3);


   entitymanager.getTransaction( ).commit( );
   entitymanager.close( );
   emfactory.close( );

    }
}
