/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectHandler;

import entity.Project;
import entity.ProjectUser;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import facade.projectUserInterface;

/**
 *
 * @author William Pfaffe
 */
public class projectMapper implements projectUserInterface {

    @Override
    public void createUser(ProjectUser user) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        entitymanager.persist(user);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }

    @Override
    public ProjectUser findUser(int id) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createQuery("SELECT pu FROM ProjectUser pu WHERE pu.idUser = :idUser");
        query.setParameter("idUser", id);
        ProjectUser user = (ProjectUser) query.getResultList();
        return user;
    }

    @Override
    public ArrayList getAllUsers() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createQuery("SELECT pu FROM ProjectUser pu");
        ArrayList<ProjectUser> user = (ArrayList<ProjectUser>) query.getResultList();
        return user;
    }

    @Override
    public void createProject(Project project) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("pu");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        entitymanager.persist(project);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }

    @Override
    public void assignUserProject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Project getProject(int idProject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
